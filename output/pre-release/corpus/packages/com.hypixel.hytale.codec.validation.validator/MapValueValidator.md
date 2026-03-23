# MapValueValidator

Type: class | Package: com.hypixel.hytale.codec.validation.validator | Implements: Validator

public class MapValueValidator<V> implements Validator<Map<?, V>>

## Fields

- private Validator<V> value

## Methods

- public MapValueValidator(Validator<V> value)
- public Validator<V> getValueValidator()
- public void accept(@Nonnull Map<?, V> map, ValidationResults results)
- public void updateSchema(SchemaContext context, Schema target)

Also in this package: ArraySizeRangeValidator, ArraySizeValidator, ArrayValidator, DeprecatedValidator, DoubleArraySizeValidator, DoubleArrayValidator, EqualValidator, FloatArrayValidator, IntArraySizeValidator, IntArrayValidator, ListValidator, MapKeyValidator, MapValidator, NonEmptyArrayValidator, NonEmptyDoubleArrayValidator, NonEmptyFloatArrayValidator, NonEmptyMapValidator, NonEmptyStringValidator, NonNullValidator, NotEqualValidator (and 6 more)

Complete API:
  public Validator<V> getValueValidator()
  public void accept(Map<?,V> map, ValidationResults results)
  public void updateSchema(SchemaContext context, Schema target)

Fields:
private Validator<V> value
