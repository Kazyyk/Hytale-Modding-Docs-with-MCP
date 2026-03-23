# Validator

Type: interface | Package: com.hypixel.hytale.codec.validation | Extends: BiConsumer<T, ValidationResults>

public interface Validator<T> extends BiConsumer<T, ValidationResults>

## Methods

- @Override public void accept(T t, ValidationResults results)
- @Override public void acceptLate(T t, ValidationResults results, ExtraInfo extraInfo)
- @Override public void updateSchema(SchemaContext context, Schema target)
- void accept(T var1, ValidationResults var2)
- void updateSchema(SchemaContext var1, Schema var2)
- @Nonnull LateValidator<T> late()

Known subclasses: AnyBooleanValidator, AnyPresentValidator, ArrayValidator, ArraysOneSetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, DoubleArrayValidator, DoubleValidator, EnumArrayValidator, ExistsIfParameterSetValidator, InstructionContextValidator, IntArrayValidator, IntValidator, NoDuplicatesValidator, OneOrNonePresentValidator, OnePresentValidator, RequiredFeatureValidator, StringArrayValidator, StringValidator, StringsAtMostOneValidator, StringsNotEmptyValidator, StringsOneSetValidator, TemporalArrayValidator, ValidateAssetIfEnumIsValidator, ValidateIfEnumIsValidator

Known implementors: ArraySizeRangeValidator, ArraySizeValidator, ArrayValidator, AssetKeyValidator, ChannelValidator, ChannelValidator, CommonAssetValidator, CosmeticAssetValidator, DoubleArraySizeValidator, DoubleArrayValidator, EqualValidator, FloatArrayValidator, InstanceValidator, IntArraySizeValidator, IntArrayValidator, IntRangeBoundValidator, LateValidator, LegacyValidator, LoopValidator, MapKeyValidator, MapValidator, MapValueValidator, NonEmptyDoubleArrayValidator, NonEmptyFloatArrayValidator, NonEmptyStringValidator, NonNullValidator, NotEqualValidator, OrValidator, RangeRefValidator, RangeValidator, RequiredMapKeysValidator, SequentialDoubleArrayValidator, UniqueInArrayValidator

Also in this package: LateValidator, LegacyValidator, Result, ThrowingValidationResults, ValidatableCodec, ValidationResult, ValidationResults, ValidatorCache, ValidatorResultsHolder, Validators

Complete API:
  void accept(T var1, ValidationResults var2)
  void updateSchema(SchemaContext var1, Schema var2)
  default LateValidator<T> late()
