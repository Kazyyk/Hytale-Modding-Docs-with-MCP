# MapValidator

Type: class | Package: com.hypixel.hytale.codec.validation.validator | Implements: Validator

public class MapValidator<K, V> implements Validator<Map<K, V>>

## Fields

- private Validator<K> key
- private Validator<V> value

## Methods

- public MapValidator(Validator<K> key, Validator<V> value)
- public void accept(@Nonnull Map<K, V> map, ValidationResults results)
- public void updateSchema(SchemaContext context, Schema target)

Also in this package: ArraySizeRangeValidator, ArraySizeValidator, ArrayValidator, DeprecatedValidator, DoubleArraySizeValidator, DoubleArrayValidator, EqualValidator, FloatArrayValidator, IntArraySizeValidator, IntArrayValidator, ListValidator, MapKeyValidator, MapValueValidator, NonEmptyArrayValidator, NonEmptyDoubleArrayValidator, NonEmptyFloatArrayValidator, NonEmptyMapValidator, NonEmptyStringValidator, NonNullValidator, NotEqualValidator (and 6 more)

Complete API:
  public void accept(Map<K,V> map, ValidationResults results)
  public void updateSchema(SchemaContext context, Schema target)

Fields:
private Validator<K> key
private Validator<V> value
