# MapKeyValidator

Type: class | Package: com.hypixel.hytale.codec.validation.validator | Implements: Validator

public class MapKeyValidator<K> implements Validator<Map<K, ?>>

## Fields

- private Validator<K> key

## Methods

- public MapKeyValidator(Validator<K> key)
- public Validator<K> getKeyValidator()
- public void accept(@Nonnull Map<K, ?> map, ValidationResults results)
- public void updateSchema(SchemaContext context, Schema target)

Also in this package: ArraySizeRangeValidator, ArraySizeValidator, ArrayValidator, DeprecatedValidator, DoubleArraySizeValidator, DoubleArrayValidator, EqualValidator, FloatArrayValidator, IntArraySizeValidator, IntArrayValidator, ListValidator, MapValidator, MapValueValidator, NonEmptyArrayValidator, NonEmptyDoubleArrayValidator, NonEmptyFloatArrayValidator, NonEmptyMapValidator, NonEmptyStringValidator, NonNullValidator, NotEqualValidator (and 6 more)

Complete API:
  public Validator<K> getKeyValidator()
  public void accept(Map<K,?> map, ValidationResults results)
  public void updateSchema(SchemaContext context, Schema target)

Fields:
private Validator<K> key
