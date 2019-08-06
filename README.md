# FontAwesome
This lib to make an easy way to use font awesome in your next project 
# How it work 
If you want to use font awesome you will download the .ttf files and add type face for your text views in your android java file 
but with   **FontAwesome** lib  you will be able to make do it with an easy way from your xml or java files 
# Setup
The lib is available on JitPack.io. Add the following to your build.gradle:
```
dependencies {
	        implementation 'com.github.AnwarSamir:FontAwesome:1.0.1'
	}
```
then 
Add support JitPack repository in root build.gradle at the end of repositories:
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
# implemntation in your XML File 
All you will do 
1- Instead of android TextView View you will replace it with 
- for **Solid Icons** [link to solid icons !](https://fontawesome.com/icons?d=gallery&s=solid)
```
    <com.asitrack.fontawesome2.FontAwesome.FontAwesomeSolidView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="&#xf641;" // you will put the code you get from fontawesome wesite in your text like -->"&#x(your icon code);"
            android:textSize="80sp"
            android:textColor="@color/colorPrimary"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintLeft_toLeftOf="parent"
            app:layout_constraintRight_toRightOf="parent"
            app:layout_constraintTop_toTopOf="parent" app:layout_constraintHorizontal_bias="0.761"
            app:layout_constraintVertical_bias="0.079" android:id="@+id/fontAwesomeSolidView"/>
```
-------------------------------------
- for **Regular Icons** [link to Regular icons !](https://fontawesome.com/icons?d=gallery&s=regular)
```
    <com.asitrack.fontawesome2.FontAwesome.FontAwesomeRegularView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="&#xf2b9;"  // you will put the code you get from fontawesome wesite in your text like -->"&#x(your icon code);"
            android:textSize="80sp"
            android:textColor="@color/colorPrimary"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintLeft_toLeftOf="parent"
            app:layout_constraintRight_toRightOf="parent"
            app:layout_constraintTop_toTopOf="parent" app:layout_constraintHorizontal_bias="0.761"
            app:layout_constraintVertical_bias="0.079" android:id="@+id/fontAwesomeSolidView"/>
```

# implemntation in your JAVA/KOTLIN Files
 - you will use next method that take 
 1- Your context 
 2- Text view defined in your java file to applay font awesome on it 
 3- Font awesome code "\u(Your font awesome code)"
 4- Color to apply on your android text view 
 
 - for **Regular Icons** [link to Regular icons !](https://fontawesome.com/icons?d=gallery&s=regular)
```
 FontAwesomeUtils.changeFontAwesomeForRegularIconColor(this,textView,"\uF057",
            resources.getColor(R.color.colorPrimary))
            
 ```
 - for **Solid Icons** [link to solid icons !](https://fontawesome.com/icons?d=gallery&s=solid)
 ```
  FontAwesomeUtils.changeFontAwesomeForSloidIconColor(this,textView,"\uF057",
            resources.getColor(R.color.colorPrimary))
            ````
