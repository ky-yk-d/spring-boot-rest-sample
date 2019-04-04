# spring-boot-rest-sample

## 構成／設定等

<!-- これから書く -->

## 取り入れている／取り入れてみたいみたいツール、考え方

### 考え方／パターン

- [x] RESTful API
- [ ] 軽量DDD
  - [ ] 値オブジェクト
  - [ ] エンティティ
  - [ ] ドメインサービス
  - [ ] 集約
  - [ ] ファクトリ
  - [ ] リポジトリ
  - [ ] アプリケーションサービス
- [ ] CQRS
  - [ ] Event Sourcing

### ツール

- [x] Spring(Boot)
  - [x] application.yml
  - [ ] Spring AOP
  - [ ] Spring Security
- [ ] ロギング
  - [x] SLF4J
  - [ ] Logback
  - [ ] 構造化ログ
- BeanMapper
  - [ ] Dozer
- ORM
  - [ ] Doma2
  - [ ] JOOQ
- テスト
  - [x] JUnit5
  - [ ] Spock
- その他
  - [ ] Lombok
  - [x] [AutoValue](https://github.com/google/auto/tree/master/value)


## 参考資料（参考にした／参考にする／参考にしてください）

### プロジェクト構成／アーキテクチャ設計

- [GitHub - citerus/dddsample-core: This is the new home of the original DDD Sample app (previously hosted at sf.net)..](https://github.com/citerus/dddsample-core)
- [GitHub - javaee/cargotracker: Applied domain-driven design blueprints for Java EE](https://github.com/javaee/cargotracker)
- [2.4. アプリケーションのレイヤ化 — TERASOLUNA Server Framework for Java (5.x) Development Guideline 5.4.1.RELEASE documentation](http://terasolunaorg.github.io/guideline/5.4.1.RELEASE/ja/Overview/ApplicationLayering.html)
- [思考停止しないアーキテクチャ設計 ➖ JJUG CCC 2018 Fall](https://www.slideshare.net/kawasima/jjug-ccc-2018-fall)

### オブジェクト指向／デザインパターン／ドメイン駆動設計の諸概念

- [「実践ドメイン駆動設計」を読んだので、実際にDDDで設計して作ってみた！](https://qiita.com/APPLE4869/items/d210ddc2cb1bfeea9338)
- [お前らがModelと呼ぶアレをなんと呼ぶべきか。近辺の用語(EntityとかVOとかDTOとか)について整理しつつ考える](https://qiita.com/takasek/items/70ab5a61756ee620aee6)
- [やはりお前たちのRepositoryは間違っている](https://qiita.com/mikesorae/items/ff8192fb9cf106262dbf)


### CQRS

- [DDD x CQRS 更新系と参照系で異なるORMを併用して上手くいった話](https://www.slideshare.net/koichiromatsuoka/ddd-x-cqrs-orm)
- [Greg Young流CQRS - Mark Nijhof - Digital Romanticism](http://d.hatena.ne.jp/digitalsoul/20100712/1278886009)
- [CORSまとめ](https://qiita.com/tomoyukilabs/items/81698edd5812ff6acb34)

### テストコード

- [Spring Boot の単体テストと結合テストの例 - Qoosky](https://www.qoosky.io/techs/84b9daad5c)
- [Spring Bootでテストを書くときのやりかたまとめ - Qiita](https://qiita.com/mitsuya/items/be50dc329b4f3abe5ac5)

### その他ツール

- [7.7. Beanマッピング(Dozer)](http://terasolunaorg.github.io/guideline/5.4.1.RELEASE/ja/ArchitectureInDetail/GeneralFuncDetail/Dozer.html)
- [doma2で複数のテーブルを結合した結果を取得する - m_shige1979のささやかな抵抗と欲望の日々](http://m-shige1979.hatenablog.com/entry/2017/01/30/080000)
