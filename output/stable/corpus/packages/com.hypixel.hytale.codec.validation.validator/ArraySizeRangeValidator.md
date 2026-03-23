# ArraySizeRangeValidator

Type: class | Package: com.hypixel.hytale.codec.validation.validator

public class ArraySizeRangeValidator<T> implements Validator<T[]>

## Fields

- private int min
- private int max

## Methods

- public ArraySizeRangeValidator(int min, int max)
- public void accept(@Nonnull T[] array, @Nonnull ValidationResults results)
- public void updateSchema(SchemaContext context, Schema target)
