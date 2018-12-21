package com.aplikasimvp.model;

public interface IUser {
    String getEmail(); /**fungsi ambil email*/
    String getPassword(); /**fungsi ambil password*/
    int isValidData(); /** Cek DATA */
}
