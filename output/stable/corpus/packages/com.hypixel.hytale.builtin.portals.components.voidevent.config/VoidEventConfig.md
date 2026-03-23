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

Also in this package: InvasionPortalConfig, VoidEventStage

Complete API:
  public int getDurationSeconds()
  public int getShouldStartAfterSeconds(int portalTimeLimitSeconds)
  public InvasionPortalConfig getInvasionPortalConfig()
  public VoidEventStage[] getStages()
  public List<VoidEventStage> getStagesSortedByStartTime()
  public String getMusicAmbienceFX()
  private void processConfig()

Fields:
public static final BuilderCodec<VoidEventConfig> CODEC
private int durationSeconds
private InvasionPortalConfig portalConfig
private VoidEventStage[] stages
private List<VoidEventStage> stagesSortedByStartTime
private String musicAmbienceFX
