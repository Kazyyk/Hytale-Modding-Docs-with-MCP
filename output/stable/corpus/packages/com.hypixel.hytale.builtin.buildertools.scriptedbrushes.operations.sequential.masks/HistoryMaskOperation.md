# HistoryMaskOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.masks | Extends: SequenceBrushOperation

public class HistoryMaskOperation extends SequenceBrushOperation

## Fields

- public static final BuilderCodec<HistoryMaskOperation> CODEC
- @Nonnull public BrushConfig.HistoryMask historyMaskArg

## Constructors

- public HistoryMaskOperation()

## Methods

- @Override public void modifyBrushConfig(@Nonnull Ref<EntityStore> ref,
        @Nonnull BrushConfig brushConfig,
        @Nonnull BrushConfigCommandExecutor brushConfigCommandExecutor,
        @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |

Also in this package: AppendMaskFromToolArgOperation, AppendMaskOperation, MaskOperation, UseBrushMaskOperation, UseOperationMaskOperation

Complete API:
  public void modifyBrushConfig(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, ComponentAccessor<EntityStore> componentAccessor)

Fields:
public static final BuilderCodec<HistoryMaskOperation> CODEC
public BrushConfig.HistoryMask historyMaskArg
