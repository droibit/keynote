
## RetrofitのServiceを使いやすくするちょっとした工夫

### 自己紹介

* 名前 (TwitterユーザID)
* 会社

### Kotlin 1.0 おめでとう的

### 概要
Connpass APIを元にKotlinでServiceインターフェースを改善を考える

* Javaで定義されたService
* KotlinでServiceを作成

### Connpass APIの最小限

* キーワード、日付、カウント
* 必須とオプション

### Javaで定義されたService

* Serviceも拡張してもいいのではないかという問いかけ
* 拡張関数+デフォルト引数
* Intよりenum
* 全部使わない時もあるのでJavaだとめんどいことを言いたい

### KotlinでServiceを定義する場合
* デフォルト引数
* Date型を例にしてプリミティブ以外も（ページを変える）

### まとめ
* デフォルト引数と適宜拡張関数でシンプルなインターフェース
* fabricのようにならないようにしましょう！

### ご清聴ありがとうございました
