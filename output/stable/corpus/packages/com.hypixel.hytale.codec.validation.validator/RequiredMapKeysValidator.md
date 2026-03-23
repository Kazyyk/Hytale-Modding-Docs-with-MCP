# RequiredMapKeysValidator

Type: class | Package: com.hypixel.hytale.codec.validation.validator | Implements: Validator

public class RequiredMapKeysValidator<T> implements Validator<Map<T, ?>>

## Fields

- private final T[] array

## Methods

- public RequiredMapKeysValidator(T[] array)
- public void accept(@Nonnull Map<T, ?> map, @Nonnull ValidationResults results)
- public void updateSchema(SchemaContext context, Schema target)
