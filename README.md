# SharedPreference

Simple and Easy to Use Android SharedPreferences.

Dependency


Just copy "haredpreferencelib" from lib folder located in app and paste this library into your lib folder.

Just add this below to your "Depencies"

dependencies {
compile files('libs/sharedpreferencelib.jar')}
 
Usage


This is the very easy and simple to use 

//save String value to SharedPreference
1. save your value to preference with some key 
eg: SharedPreference.setPreferences(MainActivity.this,"mykey","my value");
 
//Get String value from SharedPreference
eg: SharedPreference.getPreferences(MainActivity.this,"mykey);


//save Stringtype arraylist in SharedPreference

1. save your list value to SharedPreference 
eg: SharedPreference.setStringArrayListMainActivity.this,"stringarray",stringlist);
//Get String value from SharedPreference
eg: SharedPreference.getStringArrayList(MainActivity.this,"stringarray");
 
 
  
