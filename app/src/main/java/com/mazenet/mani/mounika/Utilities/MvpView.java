package com.mazenet.mani.mounika.Utilities;


import org.jetbrains.annotations.NotNull;

public interface MvpView {

    @NotNull

    void showProgressDialog();

    void hideProgressDialog();

    void showDialogWithError(int errorCode, String error);

    void showNetWorkError();


}
