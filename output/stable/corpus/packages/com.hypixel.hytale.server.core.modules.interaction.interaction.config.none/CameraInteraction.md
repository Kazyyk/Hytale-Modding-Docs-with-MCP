# CameraInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.none | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInteraction

public class CameraInteraction extends SimpleInteraction

Adjusts the camera perspective, action type, persistence, and interaction time for the user. Configurable via codec fields: `PersistCameraState`, `Action`, `Perspective`, `CameraInteractionTime`.

Also in this package: BuilderToolInteraction, CancelChainInteraction, ChainFlagInteraction, ChangeActiveSlotInteraction, ConditionInteraction, EffectConditionInteraction, EntityMatcher, HitEntity, ParallelInteraction, ParallelTag, RepeatInteraction, ReplaceInteraction, RunRootInteraction, SelectInteraction, SerialInteraction, SerialTag, SnapshotSource, StatsConditionBaseInteraction, StatsConditionInteraction, StatsConditionWithModifierInteraction

Complete API:
  protected Interaction generatePacket()
  protected void configurePacket(Interaction packet)
  public String toString()
  protected void tick0(boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  public WaitForDataFrom getWaitForDataFrom()
  public boolean needsRemoteSync()

Fields:
public static final BuilderCodec<CameraInteraction> CODEC
protected CameraActionType action
protected CameraPerspectiveType perspective
protected boolean persistCameraState
protected float cameraInteractionTime
