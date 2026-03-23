# MapKeyValidator

Type: class | Package: com.hypixel.hytale.codec.validation.validator | Implements: Validator

public class MapKeyValidator<K> implements Validator<Map<K, ?>>

## Fields

- private Validator<K> key

## Methods

- public MapKeyValidator(Validator<K> key)
- public Validator<K> getKeyValidator()
- public void accept(@Nonnull Map<K, ?> map, ValidationResults results)
- public void updateSchema(SchemaContext context, Schema target)
