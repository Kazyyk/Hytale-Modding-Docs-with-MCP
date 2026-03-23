# SaveBrushConfigOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.saveandload | Extends: SequenceBrushOperation

public class SaveBrushConfigOperation extends SequenceBrushOperation

Concrete implementation extending `SequenceBrushOperation`.

## Fields

- variableNameArg | String | String field.

## Constructors

- SaveBrushConfigOperation() | Creates a new SaveBrushConfigOperation instance.

Also in this package: LoadBrushConfigOperation, LoadOperationsFromAssetOperation, PersistentDataOperation, SaveIndexOperation

Complete API:
  public void modifyBrushConfig(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, ComponentAccessor<EntityStore> componentAccessor)

Fields:
public static final BuilderCodec<SaveBrushConfigOperation> CODEC
public String variableNameArg
