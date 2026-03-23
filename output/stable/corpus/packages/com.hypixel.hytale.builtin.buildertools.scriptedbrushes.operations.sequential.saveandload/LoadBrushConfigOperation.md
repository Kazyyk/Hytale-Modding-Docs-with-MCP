# LoadBrushConfigOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.saveandload | Extends: SequenceBrushOperation

public class LoadBrushConfigOperation extends SequenceBrushOperation

Concrete implementation extending `SequenceBrushOperation`.

## Fields

- variableNameArg | String | String field.

## Constructors

- LoadBrushConfigOperation() | Creates a new LoadBrushConfigOperation instance.

Also in this package: LoadOperationsFromAssetOperation, PersistentDataOperation, SaveBrushConfigOperation, SaveIndexOperation

Complete API:
  public void modifyBrushConfig(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, ComponentAccessor<EntityStore> componentAccessor)

Fields:
public static final BuilderCodec<LoadBrushConfigOperation> CODEC
public String variableNameArg
public List<BrushConfig.DataSettingFlags> dataSettingFlagArg
