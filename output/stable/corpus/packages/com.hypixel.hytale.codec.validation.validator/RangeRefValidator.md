# RangeRefValidator

Type: class | Package: com.hypixel.hytale.codec.validation.validator | Extends: Comparable | Implements: Validator

public class RangeRefValidator<T extends Comparable<T>> implements Validator<T>

## Fields

- private final String minPointer
- private final String maxPointer
- private final boolean inclusive

## Methods

- public RangeRefValidator(String minPointer, String maxPointer, boolean inclusive)
- public void accept(T t, ValidationResults results)
- public void updateSchema(SchemaContext context, Schema target)
