# IntRangeBoundValidator

Type: class | Package: com.hypixel.hytale.math.range | Implements: Validator

public class IntRangeBoundValidator implements Validator

## Fields

- private final Integer min
- private final Integer max
- private final boolean inclusive
- private final boolean lowerBound

## Methods

- @Nonnull public static IntRangeBoundValidator lowerBound(Integer min, Integer max, boolean inclusive)
- @Nonnull public static IntRangeBoundValidator upperBound(Integer min, Integer max, boolean inclusive)
- public void accept(IntRange intRange, ValidationResults results)
- private void validateBound(int value, String boundName, ValidationResults results)
- @Override public void updateSchema(SchemaContext context, Schema target)
- private void updateSchemaBound(IntegerSchema integerSchema)

Also in this package: FloatRange, IntRange

Complete API:
  public static IntRangeBoundValidator lowerBound(Integer min, Integer max, boolean inclusive)
  public static IntRangeBoundValidator upperBound(Integer min, Integer max, boolean inclusive)
  public void accept(IntRange intRange, ValidationResults results)
  private void validateBound(int value, String boundName, ValidationResults results)
  public void updateSchema(SchemaContext context, Schema target)
  private void updateSchemaBound(IntegerSchema integerSchema)

Fields:
private final Integer min
private final Integer max
private final boolean inclusive
private final boolean lowerBound
