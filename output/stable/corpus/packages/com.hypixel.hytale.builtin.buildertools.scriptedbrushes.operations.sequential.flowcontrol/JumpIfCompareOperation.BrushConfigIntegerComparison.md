# JumpIfCompareOperation.BrushConfigIntegerComparison

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.flowcontrol | Implements: Function

public static class BrushConfigIntegerComparison implements Function<BrushConfig, Boolean>

## Fields

- private BrushConfig.DataGettingFlags dataGettingFlag
- private ArgTypes.IntegerComparisonOperator integerComparisonOperator
- private int valueToCompareTo

## Methods

- public BrushConfigIntegerComparison()
- public BrushConfigIntegerComparison( BrushConfig.DataGettingFlags dataGettingFlag, ArgTypes.IntegerComparisonOperator integerComparisonOperator, int valueToCompareTo )
- public Boolean apply(BrushConfig brushConfig)
- public String toString()

Also in this package: ClickType, ComparisonType, ExitOperation, JumpIfBlockTypeOperation, JumpIfClickType, JumpIfCompareOperation, JumpIfStringMatchOperation, JumpIfToolArgOperation, JumpToIndexOperation, JumpToRandomIndex

Complete API:
  public Boolean apply(BrushConfig brushConfig)
  public String toString()

Fields:
public static final BuilderCodec<JumpIfCompareOperation.BrushConfigIntegerComparison> CODEC
private BrushConfig.DataGettingFlags dataGettingFlag
private ArgTypes.IntegerComparisonOperator integerComparisonOperator
private int valueToCompareTo
