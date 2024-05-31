import { Injectable } from "@angular/core";
import { HttpClient } from '@angular/common/http';
import { Observable } from "rxjs";

@Injectable({providedIn: 'root'})
export class TransactionService {
    
    private apiUrl = '/api/transactions';

    constructor(private http: HttpClient) {}


        getTransactionsByUserId(userId: number): Observable<any> {
            return this.http.get(`${this.apiUrl}/user/${userId}`);
        }

        createTransaction(transaction: any): Observable<any> {
            return this.http.post(`${this.apiUrl}`, transaction);
        }
     }