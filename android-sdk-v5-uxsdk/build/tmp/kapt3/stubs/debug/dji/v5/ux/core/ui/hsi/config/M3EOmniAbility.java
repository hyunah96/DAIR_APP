package dji.v5.ux.core.ui.hsi.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016J\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Ldji/v5/ux/core/ui/hsi/config/M3EOmniAbility;", "Ldji/v5/ux/core/ui/hsi/config/IOmniAbility;", "()V", "MAX_DOWN_AVOIDANCE_DISTANCE_IN_METER", "Lkotlin/Pair;", "", "MAX_HORIZONTAL_AVOIDANCE_DISTANCE_IN_METER", "MAX_PERCEPTION_DISTANCE_HORIZONTAL_IN_METER", "", "MAX_PERCEPTION_DISTANCE_VERTICAL_IN_METER", "MAX_UP_AVOIDANCE_DISTANCE_IN_METER", "PERCEPTION_BLIND_AREA_ANGLE", "getDownAvoidanceDistanceRange", "getDownDetectionCapability", "getHorizontalAvoidanceDistanceRange", "getHorizontalDetectionCapability", "getPerceptionBlindAreaAngle", "getUpAvoidanceDistanceRange", "getUpDetectionCapability", "android-sdk-v5-uxsdk_debug"})
public final class M3EOmniAbility implements dji.v5.ux.core.ui.hsi.config.IOmniAbility {
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.core.ui.hsi.config.M3EOmniAbility INSTANCE = null;
    public static final int MAX_PERCEPTION_DISTANCE_HORIZONTAL_IN_METER = 16;
    public static final int MAX_PERCEPTION_DISTANCE_VERTICAL_IN_METER = 10;
    private static final kotlin.Pair<java.lang.Float, java.lang.Float> MAX_HORIZONTAL_AVOIDANCE_DISTANCE_IN_METER = null;
    private static final kotlin.Pair<java.lang.Float, java.lang.Float> MAX_UP_AVOIDANCE_DISTANCE_IN_METER = null;
    private static final kotlin.Pair<java.lang.Float, java.lang.Float> MAX_DOWN_AVOIDANCE_DISTANCE_IN_METER = null;
    private static final int PERCEPTION_BLIND_AREA_ANGLE = 0;
    
    private M3EOmniAbility() {
        super();
    }
    
    @java.lang.Override
    public int getUpDetectionCapability() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlin.Pair<java.lang.Float, java.lang.Float> getUpAvoidanceDistanceRange() {
        return null;
    }
    
    @java.lang.Override
    public int getDownDetectionCapability() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlin.Pair<java.lang.Float, java.lang.Float> getDownAvoidanceDistanceRange() {
        return null;
    }
    
    @java.lang.Override
    public int getHorizontalDetectionCapability() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlin.Pair<java.lang.Float, java.lang.Float> getHorizontalAvoidanceDistanceRange() {
        return null;
    }
    
    @java.lang.Override
    public int getPerceptionBlindAreaAngle() {
        return 0;
    }
}