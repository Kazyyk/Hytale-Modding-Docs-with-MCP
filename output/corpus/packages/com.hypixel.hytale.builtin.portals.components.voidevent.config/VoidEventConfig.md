# VoidEventConfig

Type: class | Package: com.hypixel.hytale.builtin.portals.components.voidevent.config

public class VoidEventConfig

## Fields

- public static final BuilderCodec<VoidEventConfig> CODEC
- private int durationSeconds
- private InvasionPortalConfig portalConfig
- private VoidEventStage[] stages
- private List<VoidEventStage> stagesSortedByStartTime
- private String musicAmbienceFX

## Methods

- public int getDurationSeconds()
- public int getShouldStartAfterSeconds(int portalTimeLimitSeconds)
- public InvasionPortalConfig getInvasionPortalConfig()
- public VoidEventStage[] getStages()
- public List<VoidEventStage> getStagesSortedByStartTime()
- @Nullable public String getMusicAmbienceFX()
- private void processConfig()
