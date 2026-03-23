# LoopRandomOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.flowcontrol.loops

public class LoopRandomOperation

Randomized loop operation for scripted brushes.

Also in this package: CircleOffsetAndLoopOperation, CircleOffsetFromArgOperation, LoadLoopFromToolArgOperation, LoopOperation

Complete API:
  public void resetInternalState()
  public void modifyBrushConfig(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, ComponentAccessor<EntityStore> componentAccessor)
  private int randomlyChooseRepetitionsAmount()

Fields:
public static final int MAX_REPETITIONS
public static final int IDLE_STATE
public static final BuilderCodec<LoopRandomOperation> CODEC
public String indexNameArg
public Pair<Integer,Integer> repetitionsArg
private int repetitionsRemaining
