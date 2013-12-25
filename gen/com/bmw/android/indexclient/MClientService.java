/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/benjamin/workspace/IndexClient/src/com/bmw/android/indexclient/MClientService.aidl
 */
package com.bmw.android.indexclient;
public interface MClientService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.bmw.android.indexclient.MClientService
{
private static final java.lang.String DESCRIPTOR = "com.bmw.android.indexclient.MClientService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.bmw.android.indexclient.MClientService interface,
 * generating a proxy if needed.
 */
public static com.bmw.android.indexclient.MClientService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.bmw.android.indexclient.MClientService))) {
return ((com.bmw.android.indexclient.MClientService)iin);
}
return new com.bmw.android.indexclient.MClientService.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_loadFile:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.loadFile(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getWordsForPage:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _result = this.getWordsForPage(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getPageCount:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getPageCount();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.bmw.android.indexclient.MClientService
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
/**
	 * Load libraries to access the file here so that it only has to be done once.
	 * This will always be the first function called 
	 * @param path - the path of the file to be loaded
	 */
@Override public void loadFile(java.lang.String path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(path);
mRemote.transact(Stub.TRANSACTION_loadFile, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	 * The indexer will query the contents of each page one at a time.
	 * Sending all of the information at once is too large to transfer in some files.
	 * @param page - the page to be returned from the file
	 * @return - A string containing all of the words on the page
	 */
@Override public java.lang.String getWordsForPage(int page) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(page);
mRemote.transact(Stub.TRANSACTION_getWordsForPage, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
	 * 
	 * @return - the number of pages in the file specified at loadFile(String path)
	 */
@Override public int getPageCount() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPageCount, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_loadFile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getWordsForPage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getPageCount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
/**
	 * Load libraries to access the file here so that it only has to be done once.
	 * This will always be the first function called 
	 * @param path - the path of the file to be loaded
	 */
public void loadFile(java.lang.String path) throws android.os.RemoteException;
/**
	 * The indexer will query the contents of each page one at a time.
	 * Sending all of the information at once is too large to transfer in some files.
	 * @param page - the page to be returned from the file
	 * @return - A string containing all of the words on the page
	 */
public java.lang.String getWordsForPage(int page) throws android.os.RemoteException;
/**
	 * 
	 * @return - the number of pages in the file specified at loadFile(String path)
	 */
public int getPageCount() throws android.os.RemoteException;
}