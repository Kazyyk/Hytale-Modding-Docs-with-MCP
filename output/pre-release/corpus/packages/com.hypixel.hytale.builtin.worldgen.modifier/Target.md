# Target

Type: class | Package: com.hypixel.hytale.builtin.worldgen.modifier | Extends: java.lang.Object

public class Target

Configures which world-gen root and content path rules a WorldGenModifier applies to. Uses glob matching for path rules.

Also in this package: EventHandler, Modifier, PriorityEntry, WorldGenModifier

Complete API:
  public boolean matchesRoot(String name)
  public boolean matchesRule(String path)

Fields:
public static final BuilderCodec<Target> CODEC
private String root
private String[] rules
