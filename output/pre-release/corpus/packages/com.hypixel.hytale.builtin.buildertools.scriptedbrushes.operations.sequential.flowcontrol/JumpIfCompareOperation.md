# JumpIfCompareOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.flowcontrol | Extends: SequenceBrushOperation

public class JumpIfCompareOperation extends SequenceBrushOperation

## Fields

- public String indexVariableNameArg
- private BrushConfig.DataGettingFlags dataGettingFlag
- private ArgTypes.IntegerComparisonOperator integerComparisonOperator
- private int valueToCompareTo

## Methods

- public JumpIfCompareOperation()
- public void modifyBrushConfig( @Nonnull Ref<EntityStore> ref, @Nonnull BrushConfig brushConfig, @Nonnull BrushConfigCommandExecutor brushConfigCommandExecutor, @Nonnull ComponentAccessor<EntityStore> componentAccessor )
- public Boolean apply(BrushConfig brushConfig)
- public String toString()

Also in this package: BrushConfigIntegerComparison, ClickType, ComparisonType, ExitOperation, JumpIfBlockTypeOperation, JumpIfClickType, JumpIfStringMatchOperation, JumpIfToolArgOperation, JumpToIndexOperation, JumpToRandomIndex

Complete API:
  public void modifyBrushConfig(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, ComponentAccessor<EntityStore> componentAccessor)

Fields:
public static final BuilderCodec<JumpIfCompareOperation> CODEC
public List<JumpIfCompareOperation.BrushConfigIntegerComparison> comparisonsArg
public String indexVariableNameArg
