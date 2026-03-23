# LoopOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.flowcontrol.loops

public class LoopOperation

Base loop operation for scripted brush sequences.

Also in this package: CircleOffsetAndLoopOperation, CircleOffsetFromArgOperation, LoadLoopFromToolArgOperation, LoopRandomOperation

Complete API:
  public void resetInternalState()
  public void modifyBrushConfig(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, ComponentAccessor<EntityStore> componentAccessor)

Fields:
public static final int MAX_REPETITIONS
public static final int IDLE_STATE
public static final BuilderCodec<LoopOperation> CODEC
public String indexNameArg
public Integer repetitionsArg
private int repetitionsRemaining
