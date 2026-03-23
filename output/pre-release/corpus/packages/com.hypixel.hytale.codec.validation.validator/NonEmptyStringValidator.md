# NonEmptyStringValidator

Type: class | Package: com.hypixel.hytale.codec.validation.validator | Implements: Validator

public class NonEmptyStringValidator implements Validator<String>

## Constants

- public static final NonEmptyStringValidator INSTANCE

## Methods

- protected NonEmptyStringValidator()
- public void accept(@Nonnull String string, @Nonnull ValidationResults results)
- public void updateSchema(SchemaContext context, Schema target)

Also in this package: ArraySizeRangeValidator, ArraySizeValidator, ArrayValidator, DeprecatedValidator, DoubleArraySizeValidator, DoubleArrayValidator, EqualValidator, FloatArrayValidator, IntArraySizeValidator, IntArrayValidator, ListValidator, MapKeyValidator, MapValidator, MapValueValidator, NonEmptyArrayValidator, NonEmptyDoubleArrayValidator, NonEmptyFloatArrayValidator, NonEmptyMapValidator, NonNullValidator, NotEqualValidator (and 6 more)

Complete API:
  public void accept(String string, ValidationResults results)
  public void updateSchema(SchemaContext context, Schema target)

Fields:
public static final NonEmptyStringValidator INSTANCE
private static final Pattern NON_WHITESPACE_PATTERN
