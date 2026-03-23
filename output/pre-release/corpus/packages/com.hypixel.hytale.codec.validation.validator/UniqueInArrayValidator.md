# UniqueInArrayValidator

Type: class | Package: com.hypixel.hytale.codec.validation.validator

public class UniqueInArrayValidator<T> implements Validator<T[]>

## Constants

- public static final UniqueInArrayValidator<?> INSTANCE

## Methods

- private UniqueInArrayValidator()
- public void accept(@Nonnull T[] arr, @Nonnull ValidationResults results)
- public void updateSchema(SchemaContext context, @Nonnull Schema target)

Also in this package: ArraySizeRangeValidator, ArraySizeValidator, ArrayValidator, DeprecatedValidator, DoubleArraySizeValidator, DoubleArrayValidator, EqualValidator, FloatArrayValidator, IntArraySizeValidator, IntArrayValidator, ListValidator, MapKeyValidator, MapValidator, MapValueValidator, NonEmptyArrayValidator, NonEmptyDoubleArrayValidator, NonEmptyFloatArrayValidator, NonEmptyMapValidator, NonEmptyStringValidator, NonNullValidator (and 6 more)

Complete API:
  public void accept(T[] arr, ValidationResults results)
  public void updateSchema(SchemaContext context, Schema target)

Fields:
public static final UniqueInArrayValidator<?> INSTANCE
