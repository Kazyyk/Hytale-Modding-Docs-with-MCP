# OrValidator

Type: class | Package: com.hypixel.hytale.codec.validation.validator | Implements: Validator

public class OrValidator<T> implements Validator<T>

## Fields

- private final Validator<T>[] validators

## Methods

- public OrValidator(Validator<T>[] validators)
- public void accept(T t, @Nonnull ValidationResults results)
- public void updateSchema(SchemaContext context, @Nonnull Schema target)

Also in this package: ArraySizeRangeValidator, ArraySizeValidator, ArrayValidator, DeprecatedValidator, DoubleArraySizeValidator, DoubleArrayValidator, EqualValidator, FloatArrayValidator, IntArraySizeValidator, IntArrayValidator, ListValidator, MapKeyValidator, MapValidator, MapValueValidator, NonEmptyArrayValidator, NonEmptyDoubleArrayValidator, NonEmptyFloatArrayValidator, NonEmptyMapValidator, NonEmptyStringValidator, NonNullValidator (and 6 more)

Complete API:
  public void accept(T t, ValidationResults results)
  public void updateSchema(SchemaContext context, Schema target)

Fields:
private final Validator<T>[] validators
