# NonEmptyArrayValidator

Type: class | Package: com.hypixel.hytale.codec.validation.validator

public class NonEmptyArrayValidator<T> extends NonNullValidator<T[]>

## Constants

- public static final NonEmptyArrayValidator<?> INSTANCE

## Methods

- private NonEmptyArrayValidator()
- public void accept(@Nullable T[] t, @Nonnull ValidationResults results)
- public void updateSchema(SchemaContext context, Schema target)

Also in this package: ArraySizeRangeValidator, ArraySizeValidator, ArrayValidator, DeprecatedValidator, DoubleArraySizeValidator, DoubleArrayValidator, EqualValidator, FloatArrayValidator, IntArraySizeValidator, IntArrayValidator, ListValidator, MapKeyValidator, MapValidator, MapValueValidator, NonEmptyDoubleArrayValidator, NonEmptyFloatArrayValidator, NonEmptyMapValidator, NonEmptyStringValidator, NonNullValidator, NotEqualValidator (and 6 more)

Complete API:
  public void accept(T[] t, ValidationResults results)
  public void updateSchema(SchemaContext context, Schema target)

Fields:
public static final NonEmptyArrayValidator<?> INSTANCE
