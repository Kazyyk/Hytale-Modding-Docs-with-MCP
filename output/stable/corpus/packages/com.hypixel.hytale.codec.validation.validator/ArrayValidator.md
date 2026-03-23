# ArrayValidator

Type: class | Package: com.hypixel.hytale.codec.validation.validator

public class ArrayValidator<T> implements Validator<T[]>

## Fields

- private Validator<T> validator

## Methods

- public ArrayValidator(Validator<T> validator)
- public ArrayValidator(LegacyValidator<T> validator)
- public Validator<T> getValidator()
- public void accept(@Nullable T[] ts, ValidationResults results)
- public void updateSchema(SchemaContext context, Schema target)

Known subclasses: ArrayNotEmptyValidator

Also in this package: ArraySizeRangeValidator, ArraySizeValidator, DeprecatedValidator, DoubleArraySizeValidator, DoubleArrayValidator, EqualValidator, FloatArrayValidator, IntArraySizeValidator, IntArrayValidator, ListValidator, MapKeyValidator, MapValidator, MapValueValidator, NonEmptyArrayValidator, NonEmptyDoubleArrayValidator, NonEmptyFloatArrayValidator, NonEmptyMapValidator, NonEmptyStringValidator, NonNullValidator, NotEqualValidator (and 6 more)

Complete API:
  public Validator<T> getValidator()
  public void accept(T[] ts, ValidationResults results)
  public void updateSchema(SchemaContext context, Schema target)

Fields:
private Validator<T> validator
