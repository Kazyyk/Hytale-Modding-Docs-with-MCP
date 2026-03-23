# WordList

Type: class | Package: com.hypixel.hytale.server.core.asset.type.wordlist | Implements: JsonAssetWithMap

public class WordList implements JsonAssetWithMap

## Fields

- private static final String WORDLISTS_TRANSLATION_FILE
- public static final AssetBuilderCodec<String,WordList> CODEC
- private static AssetStore<String,WordList,DefaultAssetMap<String,WordList>> ASSET_STORE
- public static final ValidatorCache<String> VALIDATOR_CACHE
- private static final WordList EMPTY
- protected AssetExtraInfo.Data data
- protected String id
- protected String[] translationKeys

## Methods

- @Nonnull public static AssetStore<String,WordList,DefaultAssetMap<String,WordList>> getAssetStore()
- public static DefaultAssetMap<String,WordList> getAssetMap()
- public static WordList getWordList(String assetKey)
- public String getId()
- protected void processConfig()
- @Nullable public String pickDefaultLanguage(Random random, Set<String> alreadyUsedTranslated)
- @Nullable public String pickTranslationKey(Random random, Set<String> alreadyUsedTranslated, String languageForAlreadyUsed)
- @Nonnull private static List<T> toListMinusSet(T[] array, Set<T> set)
- @Nonnull private static List<String> toKeysListMinusTranslated(String[] translationKeys, Set<String> alreadyUsedTranslated, String language)
- @Nonnull @Override public String toString()
