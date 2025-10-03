package art.cookedincode.restbrewery.bootstrap;

import art.cookedincode.restbrewery.domain.Beer;
import art.cookedincode.restbrewery.domain.BeerStyleEnum;
import art.cookedincode.restbrewery.repositories.BeerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

/**
 * Created by Georgi Ivanov
 */
@Slf4j
@RequiredArgsConstructor
@Component
public class BeerLoader implements CommandLineRunner {

    public static final String BEER_1_UPC = "1684681684646";
    public static final String BEER_2_UPC = "6848468396846";
    public static final String BEER_3_UPC = "1684873848433";
    public static final String BEER_4_UPC = "6874634616864";
    public static final String BEER_5_UPC = "0454646378306";
    public static final String BEER_6_UPC = "1580643546806";
    public static final String BEER_7_UPC = "4894304513840";
    public static final String BEER_8_UPC = "0984346437326";
    public static final String BEER_9_UPC = "4068468604679";
    public static final String BEER_10_UPC = "6046846435167";
    public static final String BEER_11_UPC = "4687656743568";
    public static final String BEER_12_UPC = "7605468467436";
    public static final String BEER_13_UPC = "0464304603468";
    public static final String BEER_14_UPC = "4346438760064";
    public static final String BEER_15_UPC = "6840354640334";
    public static final String BEER_16_UPC = "6870843504803";
    public static final String BEER_17_UPC = "0540684604684";
    public static final String BEER_18_UPC = "7985846434030";
    public static final String BEER_19_UPC = "6035434660843";
    public static final String BEER_20_UPC = "0646464643513";
    public static final String BEER_21_UPC = "6843846841360";
    public static final String BEER_22_UPC = "1184354354640";
    public static final String BEER_23_UPC = "6453404840472";
    public static final String BEER_24_UPC = "8354346306346";
    public static final String BEER_25_UPC = "4680438430406";
    public static final String BEER_26_UPC = "6545043510300";
    public static final String BEER_27_UPC = "3484035468143";
    public static final String BEER_28_UPC = "3403050354353";
    public static final String BEER_29_UPC = "8413513054313";
    public static final String BEER_30_UPC = "2345034034543";

    private final BeerRepository beerRepository;

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private synchronized void loadBeerObjects() {
        log.debug("Loading initial data. Count is: {}", beerRepository.count());

        if (beerRepository.count() == 0) {
            Random random = new Random();

            beerRepository.save(Beer.builder()
                    .beerName("Mango Bobs")
                    .beerStyle(BeerStyleEnum.ALE)
                    .upc(BEER_1_UPC)
                    .price(new BigDecimal(BigInteger.valueOf(random.nextInt(10000)), 2))
                    .quantityOnHand(random.nextInt(5000))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Galaxy Cat")
                    .beerStyle(BeerStyleEnum.PALE_ALE)
                    .upc(BEER_2_UPC)
                    .price(new BigDecimal(BigInteger.valueOf(random.nextInt(10000)), 2))
                    .quantityOnHand(random.nextInt(5000))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("No Hammers On The Bar")
                    .beerStyle(BeerStyleEnum.WHEAT)
                    .upc(BEER_3_UPC)
                    .price(new BigDecimal(BigInteger.valueOf(random.nextInt(10000)), 2))
                    .quantityOnHand(random.nextInt(5000))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Blessed")
                    .beerStyle(BeerStyleEnum.STOUT)
                    .upc(BEER_4_UPC)
                    .price(new BigDecimal(BigInteger.valueOf(random.nextInt(10000)), 2))
                    .quantityOnHand(random.nextInt(5000))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Adjunct Trail")
                    .beerStyle(BeerStyleEnum.STOUT)
                    .upc(BEER_5_UPC)
                    .price(new BigDecimal(BigInteger.valueOf(random.nextInt(10000)), 2))
                    .quantityOnHand(random.nextInt(5000))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Very GGGreenn")
                    .beerStyle(BeerStyleEnum.IPA)
                    .upc(BEER_6_UPC)
                    .price(new BigDecimal(BigInteger.valueOf(random.nextInt(10000)), 2))
                    .quantityOnHand(random.nextInt(5000))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Double Barrel Hunahpu's")
                    .beerStyle(BeerStyleEnum.STOUT)
                    .upc(BEER_7_UPC)
                    .price(new BigDecimal(BigInteger.valueOf(random.nextInt(10000)), 2))
                    .quantityOnHand(random.nextInt(5000))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Very Hazy")
                    .beerStyle(BeerStyleEnum.IPA)
                    .upc(BEER_8_UPC)
                    .price(new BigDecimal(BigInteger.valueOf(random.nextInt(10000)), 2))
                    .quantityOnHand(random.nextInt(5000))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("SR-71")
                    .beerStyle(BeerStyleEnum.STOUT)
                    .upc(BEER_9_UPC)
                    .price(new BigDecimal(BigInteger.valueOf(random.nextInt(10000)), 2))
                    .quantityOnHand(random.nextInt(5000))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Pliny the Younger")
                    .beerStyle(BeerStyleEnum.IPA)
                    .upc(BEER_10_UPC)
                    .price(new BigDecimal(BigInteger.valueOf(random.nextInt(10000)), 2))
                    .quantityOnHand(random.nextInt(5000))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Blessed")
                    .beerStyle(BeerStyleEnum.STOUT)
                    .upc(BEER_11_UPC)
                    .price(new BigDecimal(BigInteger.valueOf(random.nextInt(10000)), 2))
                    .quantityOnHand(random.nextInt(5000))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("King Krush")
                    .beerStyle(BeerStyleEnum.IPA)
                    .upc(BEER_12_UPC)
                    .price(new BigDecimal(BigInteger.valueOf(random.nextInt(10000)), 2))
                    .quantityOnHand(random.nextInt(5000))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("PBS Porter")
                    .beerStyle(BeerStyleEnum.PORTER)
                    .upc(BEER_13_UPC)
                    .price(new BigDecimal(BigInteger.valueOf(random.nextInt(10000)), 2))
                    .quantityOnHand(random.nextInt(5000))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Pinball Porter")
                    .beerStyle(BeerStyleEnum.STOUT)
                    .upc(BEER_14_UPC)
                    .price(new BigDecimal(BigInteger.valueOf(random.nextInt(10000)), 2))
                    .quantityOnHand(random.nextInt(5000))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Golden Budda")
                    .beerStyle(BeerStyleEnum.STOUT)
                    .upc(BEER_15_UPC)
                    .price(new BigDecimal(BigInteger.valueOf(random.nextInt(10000)), 2))
                    .quantityOnHand(random.nextInt(5000))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Grand Central Red")
                    .beerStyle(BeerStyleEnum.LAGER)
                    .upc(BEER_16_UPC)
                    .price(new BigDecimal(BigInteger.valueOf(random.nextInt(10000)), 2))
                    .quantityOnHand(random.nextInt(5000))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Pac-Man")
                    .beerStyle(BeerStyleEnum.STOUT)
                    .upc(BEER_17_UPC)
                    .price(new BigDecimal(BigInteger.valueOf(random.nextInt(10000)), 2))
                    .quantityOnHand(random.nextInt(5000))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Ro Sham Bo")
                    .beerStyle(BeerStyleEnum.IPA)
                    .upc(BEER_18_UPC)
                    .price(new BigDecimal(BigInteger.valueOf(random.nextInt(10000)), 2))
                    .quantityOnHand(random.nextInt(5000))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Summer Wheatly")
                    .beerStyle(BeerStyleEnum.WHEAT)
                    .upc(BEER_19_UPC)
                    .price(new BigDecimal(BigInteger.valueOf(random.nextInt(10000)), 2))
                    .quantityOnHand(random.nextInt(5000))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Java Jill")
                    .beerStyle(BeerStyleEnum.LAGER)
                    .upc(BEER_20_UPC)
                    .price(new BigDecimal(BigInteger.valueOf(random.nextInt(10000)), 2))
                    .quantityOnHand(random.nextInt(5000))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Bike Trail Pale")
                    .beerStyle(BeerStyleEnum.PALE_ALE)
                    .upc(BEER_21_UPC)
                    .price(new BigDecimal(BigInteger.valueOf(random.nextInt(10000)), 2))
                    .quantityOnHand(random.nextInt(5000))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("N.Z.P")
                    .beerStyle(BeerStyleEnum.IPA)
                    .upc(BEER_22_UPC)
                    .price(new BigDecimal(BigInteger.valueOf(random.nextInt(10000)), 2))
                    .quantityOnHand(random.nextInt(5000))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Stawberry Blond")
                    .beerStyle(BeerStyleEnum.WHEAT)
                    .upc(BEER_23_UPC)
                    .price(new BigDecimal(BigInteger.valueOf(random.nextInt(10000)), 2))
                    .quantityOnHand(random.nextInt(5000))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Loco")
                    .beerStyle(BeerStyleEnum.PORTER)
                    .upc(BEER_24_UPC)
                    .price(new BigDecimal(BigInteger.valueOf(random.nextInt(10000)), 2))
                    .quantityOnHand(random.nextInt(5000))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Spocktoberfest")
                    .beerStyle(BeerStyleEnum.STOUT)
                    .upc(BEER_25_UPC)
                    .price(new BigDecimal(BigInteger.valueOf(random.nextInt(10000)), 2))
                    .quantityOnHand(random.nextInt(5000))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Beach Blond Ale")
                    .beerStyle(BeerStyleEnum.ALE)
                    .upc(BEER_26_UPC)
                    .price(new BigDecimal(BigInteger.valueOf(random.nextInt(10000)), 2))
                    .quantityOnHand(random.nextInt(5000))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Bimini Twist IPA")
                    .beerStyle(BeerStyleEnum.IPA)
                    .upc(BEER_27_UPC)
                    .price(new BigDecimal(BigInteger.valueOf(random.nextInt(10000)), 2))
                    .quantityOnHand(random.nextInt(5000))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Rod Bender Red Ale")
                    .beerStyle(BeerStyleEnum.ALE)
                    .upc(BEER_28_UPC)
                    .price(new BigDecimal(BigInteger.valueOf(random.nextInt(10000)), 2))
                    .quantityOnHand(random.nextInt(5000))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Floating Dock")
                    .beerStyle(BeerStyleEnum.SAISON)
                    .upc(BEER_29_UPC)
                    .price(new BigDecimal(BigInteger.valueOf(random.nextInt(10000)), 2))
                    .quantityOnHand(random.nextInt(5000))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("El Hefe")
                    .beerStyle(BeerStyleEnum.WHEAT)
                    .upc(BEER_30_UPC)
                    .price(new BigDecimal(BigInteger.valueOf(random.nextInt(10000)), 2))
                    .quantityOnHand(random.nextInt(5000))
                    .build());

            log.debug("Beer Records loaded: {}", beerRepository.count());
        }
    }
}
