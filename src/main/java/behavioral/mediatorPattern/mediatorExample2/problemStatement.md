Arabulucu ( Mediator ) Tasarım Deseni

Uygulama büyüdükçe, bir çok sınıfı ve sınıf hiyerarşilerini içerir. Uygulamanın mantık ve veri koldarı bu sınıflara dağıtılır. Uygulamanın çalışabilmesi için bu sınıflar arasında sürekli bir haberleşme vardır. Sınıfların sayısı arttıkça, aralarındaki bağımlılıklar artar, uygulamanın bakımı ve değiştirilmesi zorlaşır. İşte arabulucu tasarım deseni, bu sınıflar arasındaki bağımlılıkları azaltmak ve aralarındaki iletişimi kolaylaştırmak için kullanılır. Bu sınıflar arasında arabuluculuk yapar.

Örnek Uygulama

Örnek uygulamada, istemci durumundaki Kullanıcı nın bilgisayar, televizyon ve radyo olmak üzere 3 adet elektronik aygıtı vardır. Bu istemci, aynı anda yalnızca bir tane aygıtın çalışmasını istiyor. Bu durumda, herhangi bir aygıttan biri çalıştığında diğerlerinin durması gerekmektedir. Örnekte arabulucu sınıf olan Arabulucu nesnesi, kullanıcı ile bu üç aygıt arasındaki haberleşmeyi sağlamaktadır. Böylece kullanıcı ile aygıtlar arasındaki bağımlılık azalmıştır. Ayrıca kullanıcının istediği bir zamanda yalnızca bir tane aygıt çalışması mantığını da bu arabulucu sınıf sağlamaktadır.