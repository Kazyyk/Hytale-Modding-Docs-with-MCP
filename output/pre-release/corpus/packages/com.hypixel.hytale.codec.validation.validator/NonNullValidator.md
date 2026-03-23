# NonNullValidator

Type: class | Package: com.hypixel.hytale.codec.validation.validator | Implements: Validator

public class NonNullValidator<T> implements Validator<T>

## Constants

- public static final NonNullValidator<?> INSTANCE

## Methods

- protected NonNullValidator()
- public void accept(@Nullable T t, @Nonnull ValidationResults results)
- public void updateSchema(SchemaContext context, Schema target)

Known subclasses: NonEmptyArrayValidator, NonEmptyMapValidator

Also in this package: ArraySizeRangeValidator, ArraySizeValidator, ArrayValidator, DeprecatedValidator, DoubleArraySizeValidator, DoubleArrayValidator, EqualValidator, FloatArrayValidator, IntArraySizeValidator, IntArrayValidator, ListValidator, MapKeyValidator, MapValidator, MapValueValidator, NonEmptyArrayValidator, NonEmptyDoubleArrayValidator, NonEmptyFloatArrayValidator, NonEmptyMapValidator, NonEmptyStringValidator, NotEqualValidator (and 6 more)

Complete API:
  public void accept(T t, ValidationResults results)
  public void updateSchema(SchemaContext context, Schema target)

Fields:
public static final NonNullValidator<?> INSTANCE
