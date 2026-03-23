# ResponseCurve

Type: class | Package: com.hypixel.hytale.server.core.asset.type.responsecurve.config | Implements: JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, ResponseCurve>>

public abstract class ResponseCurve implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, ResponseCurve>>

## Fields

- public static final AssetCodecMapCodec<String, ResponseCurve> CODEC
- public static final BuilderCodec<ResponseCurve> BASE_CODEC
- public static final ValidatorCache<String> VALIDATOR_CACHE
- private static AssetStore<String, ResponseCurve, IndexedLookupTableAssetMap<String, ResponseCurve>> ASSET_STORE
- protected AssetExtraInfo.Data extraData
- protected String id
- protected WeakReference<ResponseCurve> reference

## Constructors

- public ResponseCurve(String id)
- protected ResponseCurve()

## Methods

- public static AssetStore<String, ResponseCurve, IndexedLookupTableAssetMap<String, ResponseCurve>> getAssetStore()
- public static IndexedLookupTableAssetMap<String, ResponseCurve> getAssetMap()
- public String getId()
- public WeakReference<ResponseCurve> getReference()
- public abstract double computeY(double var1)
- @Nonnull @Override public String toString()

## Inner Types

- `ResponseCurve.Reference`

Known subclasses: ExponentialResponseCurve, LogisticResponseCurve, SineWaveResponseCurve

Also in this package: ExponentialResponseCurve, LogisticResponseCurve, Reference, SineWaveResponseCurve

Complete API:
  public static AssetStore<String,ResponseCurve,IndexedLookupTableAssetMap<String,ResponseCurve>> getAssetStore()
  public static IndexedLookupTableAssetMap<String,ResponseCurve> getAssetMap()
  public String getId()
  public WeakReference<ResponseCurve> getReference()
  public abstract double computeY(double var1)
  public String toString()

Fields:
public static final AssetCodecMapCodec<String,ResponseCurve> CODEC
public static final BuilderCodec<ResponseCurve> BASE_CODEC
public static final ValidatorCache<String> VALIDATOR_CACHE
private static AssetStore<String,ResponseCurve,IndexedLookupTableAssetMap<String,ResponseCurve>> ASSET_STORE
protected AssetExtraInfo.Data extraData
protected String id
protected WeakReference<ResponseCurve> reference
