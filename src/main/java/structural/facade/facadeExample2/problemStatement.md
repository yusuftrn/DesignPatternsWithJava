Senaryomuz, bir e-ticaret uygulaması üzerinde sipariş algoritması olsun 
Kullanıcı sepetini oluşturduktan sonra ödeme ve kargo bilgilerini de girerek tek tuşla siparişini verir.
(Oysa bilen bilir arkada neler olduğunu)

1. Bankaya gerekli bilgileri gönder ve onay al.
2. Müşteri nesnesini oluştur.
3. Seçilen kargo şirketini de nesne olarak oluştur.
4. Oluşturulan siparişi veritabanına ekle ve yeni Sipariş id’sini bellekte tut.
5. Yeni sipariş id’si ile satın alınan tüm ürünleri ilişkilendir ve veritabanına ekle.
6. Satın alınan ürünlerin stoklarını güncelle.
7. İşlemi tamamla.

Bu yedi adımın da farklı nesnelerin sorumluluğunda olduğunu düşünürsek, 
   her sipariş verme işleminde bu adımları tekrar tekrar kurgulamak işimizi oldukça karmaşıklaştırır. 
   Bunun yerine tüm bu adımları yerine getiren bir nesne inşa edebilirsiniz. 
İşte o nesneniz Façade olur!