## Customized Toast

```kotlin
    button.setOnClickListener {
    CustomToast.customToast(
                    context = this@MainActivity,
                    message = "This is Default Toast!",
                    duration = CustomToast.LENGTH_SHORT,
                    type = CustomToast.DEFAULT,
                    isIconAnimated = true,
                    customIcon = R.drawable.ic_heart,
                    font = R.font.helveticabold,
                    customBackground = R.drawable.intelliswift,
                    textColor = Color.WHITE,
                    customIconAnimation = R.anim.rotate
                ).show()
            }
```

# Implementation  

```gradle  
repositories {  
 maven { url 'https://jitpack.io' }  
}  
  
dependencies {  
  implementation 'com.github.cbb-intelliswift:CustomToast:2e3d07ed9a'
}  
```

```Link
[![](https://jitpack.io/v/cbb-intelliswift/CustomToast.svg)](https://jitpack.io/#cbb-intelliswift/CustomToast)
```
