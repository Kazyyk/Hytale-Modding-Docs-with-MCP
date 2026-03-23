# RequiredMapKeysValidator

Type: class | Package: com.hypixel.hytale.codec.validation.validator | Implements: Validator

public class RequiredMapKeysValidator<T> implements Validator<Map<T, ?>>

## Fields

- private final T[] array

## Methods

- public RequiredMapKeysValidator(T[] array)
- public void accept(@Nonnull Map<T, ?> map, @Nonnull ValidationResults results)
- public void updateSchema(SchemaContext context, Schema target)

Also in this package: ArraySizeRangeValidator, ArraySizeValidator, ArrayValidator, DeprecatedValidator, DoubleArraySizeValidator, DoubleArrayValidator, EqualValidator, FloatArrayValidator, IntArraySizeValidator, IntArrayValidator, ListValidator, MapKeyValidator, MapValidator, MapValueValidator, NonEmptyArrayValidator, NonEmptyDoubleArrayValidator, NonEmptyFloatArrayValidator, NonEmptyMapValidator, NonEmptyStringValidator, NonNullValidator (and 6 more)

Complete API:
  public void accept(Map<T,?> map, ValidationResults results)
  public void updateSchema(SchemaContext context, Schema target)

Fields:
private final T[] array
