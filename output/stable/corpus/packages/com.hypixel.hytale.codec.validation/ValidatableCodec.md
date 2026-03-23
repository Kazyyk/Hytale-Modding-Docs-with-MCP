# ValidatableCodec

Type: interface | Package: com.hypixel.hytale.codec.validation | Extends: Codec<T>

public interface ValidatableCodec<T> extends Codec<T>

## Methods

- void validate(T var1, ExtraInfo var2)
- void validateDefaults(ExtraInfo var1, Set<Codec<?>> var2)

Known implementors: ACodecMapCodec, AMapProvidedMapCodec, AssetCodec, BuilderCodec, ContainedAssetCodec, FloatRangeArrayCodec, IntRangeArrayCodec

Also in this package: LateValidator, LegacyValidator, Result, ThrowingValidationResults, ValidationResult, ValidationResults, Validator, ValidatorCache, ValidatorResultsHolder, Validators

Complete API:
  void validate(T var1, ExtraInfo var2)
  void validateDefaults(ExtraInfo var1, Set<Codec<?>> var2)
  static void validateDefaults(Codec<?> codec, ExtraInfo extraInfo, Set<Codec<?>> tested)
