# ProjectileInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.projectile.interaction | Extends: SimpleInstantInteraction | Implements: BallisticDataProvider

public class ProjectileInteraction extends SimpleInstantInteraction implements BallisticDataProvider

## Fields

- public static final BuilderCodec<ProjectileInteraction> CODEC
- protected String config

## Methods

- @Nullable public ProjectileConfig getConfig()
- @Nullable @Override public BallisticData getBallisticData()
- @Nonnull @Override public WaitForDataFrom getWaitForDataFrom()
- @Override public boolean needsRemoteSync()
- @Override protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
- @Override protected void simulateFirstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
- @Nonnull @Override protected Interaction generatePacket()
- @Override protected void configurePacket(Interaction packet)

Complete API:
  public ProjectileConfig getConfig()
  public BallisticData getBallisticData()
  public WaitForDataFrom getWaitForDataFrom()
  public boolean needsRemoteSync()
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected void simulateFirstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected Interaction generatePacket()
  protected void configurePacket(Interaction packet)

Fields:
public static final BuilderCodec<ProjectileInteraction> CODEC
protected String config
