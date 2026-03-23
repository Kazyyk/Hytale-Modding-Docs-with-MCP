# ArraySizeValidator

Type: class | Package: com.hypixel.hytale.codec.validation.validator

public class ArraySizeValidator<T> implements Validator<T[]>

## Fields

- private final int size

## Methods

- public ArraySizeValidator(int size)
- public void accept(@Nonnull T[] array, @Nonnull ValidationResults results)
- public void updateSchema(SchemaContext context, Schema target)
