# MaskOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.masks | Extends: SequenceBrushOperation

public class MaskOperation extends SequenceBrushOperation

## Fields

- public static final BuilderCodec<MaskOperation> CODEC
- @Nonnull public BlockMask operationMaskArg

## Constructors

- public MaskOperation()

## Methods

- @Override public void modifyBrushConfig(@Nonnull Ref<EntityStore> ref,
        @Nonnull BrushConfig brushConfig,
        @Nonnull BrushConfigCommandExecutor brushConfigCommandExecutor,
        @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |

Also in this package: AppendMaskFromToolArgOperation, AppendMaskOperation, HistoryMaskOperation, UseBrushMaskOperation, UseOperationMaskOperation

Complete API:
  public void modifyBrushConfig(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, ComponentAccessor<EntityStore> componentAccessor)

Fields:
public static final BuilderCodec<MaskOperation> CODEC
public BlockMask operationMaskArg
