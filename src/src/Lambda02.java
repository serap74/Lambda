package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda02 {
    // Task : Functional Programming ile listin cift elemanlarinin  karelerini ayni satirda aralarina bosluk bırakarak print ediniz
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(4, 2, 6, 11, -5,  7, 3, 15));
        ciftKarePrint(sayi);
        System.out.println("\n   ***   ");
        tekKupBirFazlaPrint(sayi);
        System.out.println("\n   ***   ");
        ciftKarePrintt(sayi);
        System.out.println("\n   ***   ");
        maxElemanBul(sayi);
        System.out.println("\n   ***   ");
        ciftElemanKareMax(sayi);
        System.out.println("\n   ***   ");
        elemanTopla(sayi);

    }
public static void ciftKarePrint(List<Integer> sayi ){
        sayi.stream().filter(Lambda01::ciftBul).map(t-> t*t).forEach(Lambda01::yazdir);
        //map()--> Stream içerisindeki elemanları başka tiplere dönüştürmek veya üzerlerinde işlem yapmak (update) için Map kullanılmaktadır.

    // Task : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak print edi

    }
    public static void tekKupBirFazlaPrint(List<Integer>sayi){
        sayi.stream().//sayilar akisa alindi
                filter(t-> t%2==1).//tek elemanlar filtrelendi
                map(t->(t*t*t)+1).//tek elemanlarin kupleriinin 1 fazlasini aldi
                forEach(Lambda01::yazdir);//print edildi

    }
// Task : Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
// Task : Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void ciftKarePrintt(List<Integer> sayi){
        sayi.stream().
        filter(Lambda01::ciftBul).
        map(Math::sqrt).//methodref
        forEach(t->System.out.print(t+" "));
       //forEach(Lambda01::yazdir)=
}
        // Task : list'in en buyuk elemanini yazdiriniz
    public static void maxElemanBul(List<Integer> sayi){
         Optional<Integer> maxSayi=sayi.
                 stream().reduce(Math::max);//akisa giren elemanlari aksiyon sonrasi tek eleman haline getirir
        System.out.println(maxSayi);
        System.out.println(sayi.
                stream().reduce(Math::max));
        /*
 reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
 kullanımı yaygındır pratiktir.
 Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
 bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
 reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
 reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
 İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.

 */

    }
    // Task : List'in cift elemanlarin karelerinin en buyugunu print ediniz
    public static void ciftElemanKareMax(List<Integer> sayi){
              sayi.stream().
              filter(Lambda01::ciftBul).
              map(t->t*t).
              reduce(Math::max);
        System.out.println(sayi.stream().
                filter(Lambda01::ciftBul).
                map(t->t*t).
                reduce(Integer::max));
        System.out.println(sayi.stream().
                filter(Lambda01::ciftBul).
                map(t->t*t).
                reduce(Math::max));
    }
    // Task : List'teki tum elemanlarin toplamini yazdiriniz.
//Lambda Expression...
    public static void elemanTopla(List<Integer> sayi){
        sayi.stream().reduce(0,(a,b)->a+b);
        System.out.println(sayi.stream().reduce(0,(a,b)->a+b));
        System.out.println(sayi.stream().reduce(Integer::sum));
    }
}
