# MapValueValidator

Type: class | Package: com.hypixel.hytale.codec.validation.validator | Implements: Validator

public class MapValueValidator<V> implements Validator<Map<?, V>>

## Fields

- private Validator<V> value

## Methods

- public MapValueValidator(Validator<V> value)
- public Validator<V> getValueValidator()
- public void accept(@Nonnull Map<?, V> map, ValidationResults results)
- public void updateSchema(SchemaContext context, Schema target)
