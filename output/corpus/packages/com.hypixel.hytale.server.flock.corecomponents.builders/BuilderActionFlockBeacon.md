# BuilderActionFlockBeacon

Type: class | Package: com.hypixel.hytale.server.flock.corecomponents.builders | Extends: BuilderActionBase

public class BuilderActionFlockBeacon extends BuilderActionBase

NPC behavior action builder for ActionFlockBeacon functionality.

## Fields

- protected final StringHolder message
- protected String sendTargetSlot
- protected double expirationTime
- protected boolean sendToSelf
- protected boolean sendToLeaderOnly

## Methods

- @Nonnull public ActionFlockBeacon build(@Nonnull BuilderSupport builderSupport)
- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Override public void registerTags(@Nonnull Set<String> tags)
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Nonnull public BuilderActionFlockBeacon readConfig(@Nonnull JsonElement data)
- public String getMessage(@Nonnull BuilderSupport builderSupport)
- public int getSendTargetSlot(@Nonnull BuilderSupport support)
- public double getExpirationTime()
- public boolean isSendToSelf()
- public boolean isSendToLeaderOnly()
