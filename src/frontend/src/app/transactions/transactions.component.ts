import { Component, OnInit } from '@angular/core';
import { TransactionService } from '../services/transaction.service';

@Component({
  selector: 'app-transactions',
  templateUrl: './transactions.component.html',
  styleUrls: ['./transactions.component.scss']
})
export class TransactionsComponent implements OnInit{

  transactions: any[] = [];
  newTransaction: any = {
    type: '',
    amount: 0,
    description: '',
    date: '',
    user: {
      id: 1
    }
  };

  constructor(
    private transactionService: TransactionService) {}

  ngOnInit() {
    this.loadTransactions();
  }

  loadTransactions() {
    this.transactionService.getTransactionsByUserId(1).subscribe((data: any) => {
      this.transactions = data;
    });
  }

  createTransaction() {
    this.transactionService.createTransaction(this.newTransaction).subscribe(data => {
      this.transactions.push(data);
      this.newTransaction = {
        type: '',
        amount: 0,
        description: '',
        date: '',
        user: {
          id: 1
        }
      };
    });
  }


}
