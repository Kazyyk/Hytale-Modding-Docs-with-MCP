# NotEqualValidator

Type: class | Package: com.hypixel.hytale.codec.validation.validator | Extends: Comparable | Implements: Validator

public class NotEqualValidator<T extends Comparable<T>> implements Validator<T>

## Fields

- private final T value

## Methods

- public NotEqualValidator(@Nonnull T value)
- public void accept(@Nullable T o, @Nonnull ValidationResults results)
- public void updateSchema(SchemaContext context, @Nonnull Schema target)

Also in this package: ArraySizeRangeValidator, ArraySizeValidator, ArrayValidator, DeprecatedValidator, DoubleArraySizeValidator, DoubleArrayValidator, EqualValidator, FloatArrayValidator, IntArraySizeValidator, IntArrayValidator, ListValidator, MapKeyValidator, MapValidator, MapValueValidator, NonEmptyArrayValidator, NonEmptyDoubleArrayValidator, NonEmptyFloatArrayValidator, NonEmptyMapValidator, NonEmptyStringValidator, NonNullValidator (and 6 more)

Complete API:
  public void accept(T o, ValidationResults results)
  public void updateSchema(SchemaContext context, Schema target)

Fields:
private final T value
