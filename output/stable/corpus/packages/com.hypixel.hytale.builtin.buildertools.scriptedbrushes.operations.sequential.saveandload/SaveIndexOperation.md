# SaveIndexOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.saveandload | Extends: SequenceBrushOperation

public class SaveIndexOperation extends SequenceBrushOperation

Concrete implementation extending `SequenceBrushOperation`.

## Fields

- variableNameArg | String | String field.

## Constructors

- SaveIndexOperation() | Creates a new SaveIndexOperation instance.

## Methods

- preExecutionModifyBrushConfig(@Nonnull BrushConfigCommandExecutor brushConfigCommandExecutor, int operationIndex) | void | public method.

Also in this package: LoadBrushConfigOperation, LoadOperationsFromAssetOperation, PersistentDataOperation, SaveBrushConfigOperation

Complete API:
  public void preExecutionModifyBrushConfig(BrushConfigCommandExecutor brushConfigCommandExecutor, int operationIndex)
  public void modifyBrushConfig(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, ComponentAccessor<EntityStore> componentAccessor)

Fields:
public static final BuilderCodec<SaveIndexOperation> CODEC
public String variableNameArg
