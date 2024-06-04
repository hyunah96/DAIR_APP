package dji.v5.ux.training.simulatorcontrol;

import java.lang.System;

/**
 * Simulator Control Widget
 *
 * Widget can be used for quick simulation of the aircraft flight without flying it.
 * Aircraft should be connected to run the simulation.
 * User can enter the location coordinates, satellite count and
 * data frequency. The user has the option to save presets to reuse simulation
 * configuration.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00ca\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00f6\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0006\u00f6\u0001\u00f7\u0001\u00f8\u0001B%\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\n\u0010\u00c1\u0001\u001a\u00030\u00c2\u0001H\u0002J\n\u0010\u00c3\u0001\u001a\u00030\u00c4\u0001H\u0016J\u000f\u0010\u00c5\u0001\u001a\n\u0012\u0005\u0012\u00030\u009e\u00010\u00c6\u0001J\u0010\u0010\u00c7\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020\u00c6\u0001H\u0016J\u0013\u0010\u00c8\u0001\u001a\u00030\u00c2\u00012\u0007\u0010\u00c9\u0001\u001a\u00020LH\u0002J\u001a\u0010\u00ca\u0001\u001a\u00030\u00c2\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0003J$\u0010\u00cb\u0001\u001a\u00030\u00c2\u00012\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0014J\n\u0010\u00cc\u0001\u001a\u00030\u00c2\u0001H\u0002J\u0012\u0010\u00cd\u0001\u001a\u00020\n2\u0007\u0010\u00ce\u0001\u001a\u00020\nH\u0002J\n\u0010\u00cf\u0001\u001a\u00030\u00c2\u0001H\u0014J\u0014\u0010\u00d0\u0001\u001a\u00030\u00c2\u00012\b\u0010\u00d1\u0001\u001a\u00030\u00d2\u0001H\u0016J\n\u0010\u00d3\u0001\u001a\u00030\u00c2\u0001H\u0014J\u0016\u0010\u00d4\u0001\u001a\u00030\u00c2\u00012\n\u0010\u00d5\u0001\u001a\u0005\u0018\u00010\u00d6\u0001H\u0016J\u0013\u0010\u00d7\u0001\u001a\u00030\u00c2\u00012\u0007\u0010\u00d8\u0001\u001a\u00020LH\u0002J\n\u0010\u00d9\u0001\u001a\u00030\u00c2\u0001H\u0014J\u0012\u0010\u0019\u001a\u00030\u00c2\u00012\t\b\u0001\u0010\u00da\u0001\u001a\u00020\nJ\u0013\u0010\u00db\u0001\u001a\u00030\u00c2\u00012\t\b\u0001\u0010\u00dc\u0001\u001a\u00020\nJ\u0013\u0010\u00dd\u0001\u001a\u00030\u00c2\u00012\u0007\u0010\u00de\u0001\u001a\u00020LH\u0016J\u0012\u00106\u001a\u00030\u00c2\u00012\t\b\u0001\u0010\u00da\u0001\u001a\u00020\nJ\u0013\u0010\u00df\u0001\u001a\u00030\u00c2\u00012\t\b\u0001\u0010\u00dc\u0001\u001a\u00020\nJ\u0012\u0010B\u001a\u00030\u00c2\u00012\t\b\u0001\u0010\u00da\u0001\u001a\u00020\nJ\u0013\u0010\u00e0\u0001\u001a\u00030\u00c2\u00012\t\b\u0001\u0010\u00dc\u0001\u001a\u00020\nJ\u0012\u0010Y\u001a\u00030\u00c2\u00012\t\b\u0001\u0010\u00da\u0001\u001a\u00020\nJ\u0013\u0010\u00e1\u0001\u001a\u00030\u00c2\u00012\t\b\u0001\u0010\u00dc\u0001\u001a\u00020\nJ\u0013\u0010\u0089\u0001\u001a\u00030\u00c2\u00012\t\b\u0001\u0010\u00da\u0001\u001a\u00020\nJ\u0013\u0010\u008c\u0001\u001a\u00030\u00c2\u00012\t\b\u0001\u0010\u00da\u0001\u001a\u00020\nJ\u0013\u0010\u00e2\u0001\u001a\u00030\u00c2\u00012\u0007\u0010\u00e3\u0001\u001a\u00020LH\u0002J\u0013\u0010\u0092\u0001\u001a\u00030\u00c2\u00012\t\b\u0001\u0010\u00da\u0001\u001a\u00020\nJ\u0013\u0010\u00e4\u0001\u001a\u00030\u00c2\u00012\t\b\u0001\u0010\u00dc\u0001\u001a\u00020\nJ\u0013\u0010\u00a1\u0001\u001a\u00030\u00c2\u00012\t\b\u0001\u0010\u00da\u0001\u001a\u00020\nJ\u0013\u0010\u00e5\u0001\u001a\u00030\u00c2\u00012\t\b\u0001\u0010\u00dc\u0001\u001a\u00020\nJ\u001c\u0010\u00e6\u0001\u001a\u00030\u00c2\u00012\u0007\u0010\u00e7\u0001\u001a\u00020\n2\u0007\u0010\u00e8\u0001\u001a\u00020LH\u0002J\n\u0010\u00e9\u0001\u001a\u00030\u00c2\u0001H\u0002J\n\u0010\u00ea\u0001\u001a\u00030\u00c2\u0001H\u0002J\n\u0010\u00eb\u0001\u001a\u00030\u00c2\u0001H\u0002J\n\u0010\u00ec\u0001\u001a\u00030\u00c2\u0001H\u0002J\u0013\u0010\u00ed\u0001\u001a\u00030\u00c2\u00012\u0007\u0010\u00ee\u0001\u001a\u00020\nH\u0002J\u0013\u0010\u00ef\u0001\u001a\u00030\u00c2\u00012\u0007\u0010\u00f0\u0001\u001a\u00020LH\u0002J\n\u0010\u00f1\u0001\u001a\u00030\u00c2\u0001H\u0002J\n\u0010\u00f2\u0001\u001a\u00030\u00c2\u0001H\u0002J\u0014\u0010\u00f3\u0001\u001a\u00030\u00c2\u00012\b\u0010\u00f4\u0001\u001a\u00030\u00f5\u0001H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\u0014\u001a\u0004\u0018\u00010!8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010)\u001a\u00020(2\u0006\u0010\'\u001a\u00020(8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020/X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u00104\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b5\u0010\u0018\"\u0004\b6\u0010\u001aR$\u00107\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b8\u0010\u001e\"\u0004\b9\u0010 R(\u0010:\u001a\u0004\u0018\u00010!2\b\u0010\u0014\u001a\u0004\u0018\u00010!8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b;\u0010$\"\u0004\b<\u0010&R$\u0010=\u001a\u00020(2\u0006\u0010\'\u001a\u00020(8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b>\u0010+\"\u0004\b?\u0010-R(\u0010@\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bA\u0010\u0018\"\u0004\bB\u0010\u001aR$\u0010C\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bD\u0010\u001e\"\u0004\bE\u0010 R(\u0010F\u001a\u0004\u0018\u00010!2\b\u0010\u0014\u001a\u0004\u0018\u00010!8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bG\u0010$\"\u0004\bH\u0010&R$\u0010I\u001a\u00020(2\u0006\u0010\'\u001a\u00020(8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bJ\u0010+\"\u0004\bK\u0010-R$\u0010M\u001a\u00020L2\u0006\u0010\u0014\u001a\u00020L@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010Q\u001a\u00020L2\u0006\u0010\u0014\u001a\u00020L@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010N\"\u0004\bR\u0010PR$\u0010S\u001a\u00020L2\u0006\u0010\u0014\u001a\u00020L@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010N\"\u0004\bT\u0010PR$\u0010U\u001a\u00020L2\u0006\u0010\u0014\u001a\u00020L@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010N\"\u0004\bV\u0010PR(\u0010W\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bX\u0010\u0018\"\u0004\bY\u0010\u001aR$\u0010Z\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b[\u0010\u001e\"\u0004\b\\\u0010 R(\u0010]\u001a\u0004\u0018\u00010!2\b\u0010\u0014\u001a\u0004\u0018\u00010!8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b^\u0010$\"\u0004\b_\u0010&R$\u0010`\u001a\u00020(2\u0006\u0010\'\u001a\u00020(8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\ba\u0010+\"\u0004\bb\u0010-R\u000e\u0010c\u001a\u00020dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010m\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010o\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010q\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u000202X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010t\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010u\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010v\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010w\u001a\u00020xX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010y\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bz\u0010\u001e\"\u0004\b{\u0010 R(\u0010|\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b}\u0010\u0018\"\u0004\b~\u0010\u001aR*\u0010\u007f\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0080\u0001\u0010\u0018\"\u0005\b\u0081\u0001\u0010\u001aR\u000f\u0010\u0082\u0001\u001a\u00020LX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u00018BX\u0082\u0004\u00a2\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R+\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015@FX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0001\u0010\u0018\"\u0005\b\u0089\u0001\u0010\u001aR+\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015@FX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010\u0018\"\u0005\b\u008c\u0001\u0010\u001aR\u0010\u0010\u008d\u0001\u001a\u00030\u008e\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u008f\u0001\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0091\u0001\u0010\u0018\"\u0005\b\u0092\u0001\u0010\u001aR\'\u0010\u0093\u0001\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0094\u0001\u0010\u001e\"\u0005\b\u0095\u0001\u0010 R+\u0010\u0096\u0001\u001a\u0004\u0018\u00010!2\b\u0010\u0014\u001a\u0004\u0018\u00010!8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0097\u0001\u0010$\"\u0005\b\u0098\u0001\u0010&R\'\u0010\u0099\u0001\u001a\u00020(2\u0006\u0010\'\u001a\u00020(8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u009a\u0001\u0010+\"\u0005\b\u009b\u0001\u0010-R\u0017\u0010\u009c\u0001\u001a\n\u0012\u0005\u0012\u00030\u009e\u00010\u009d\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00a0\u0001\u0010\u0018\"\u0005\b\u00a1\u0001\u0010\u001aR\'\u0010\u00a2\u0001\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00a3\u0001\u0010\u001e\"\u0005\b\u00a4\u0001\u0010 R+\u0010\u00a5\u0001\u001a\u0004\u0018\u00010!2\b\u0010\u0014\u001a\u0004\u0018\u00010!8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00a6\u0001\u0010$\"\u0005\b\u00a7\u0001\u0010&R\'\u0010\u00a8\u0001\u001a\u00020(2\u0006\u0010\'\u001a\u00020(8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00a9\u0001\u0010+\"\u0005\b\u00aa\u0001\u0010-R!\u0010\u00ab\u0001\u001a\u00030\u00ac\u00018BX\u0082\u0084\u0002\u00a2\u0006\u0010\n\u0006\b\u00af\u0001\u0010\u00b0\u0001\u001a\u0006\b\u00ad\u0001\u0010\u00ae\u0001R\u000f\u0010\u00b1\u0001\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00b2\u0001\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00b3\u0001\u001a\u000202X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00b4\u0001\u001a\u000202X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00b5\u0001\u001a\u000202X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00b6\u0001\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00b7\u0001\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00b8\u0001\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00b9\u0001\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00ba\u0001\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00bb\u0001\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00bc\u0001\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00bd\u0001\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00be\u0001\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00bf\u0001\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00c0\u0001\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00f9\u0001"}, d2 = {"Ldji/v5/ux/training/simulatorcontrol/SimulatorControlWidget;", "Ldji/v5/ux/core/base/widget/ConstraintLayoutWidget;", "Ldji/v5/ux/training/simulatorcontrol/SimulatorControlWidget$ModelState;", "Landroid/view/View$OnClickListener;", "Ldji/v5/ux/training/simulatorcontrol/preset/OnLoadPresetListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "aircraftFlyingLabelTextView", "Landroid/widget/TextView;", "aircraftFlyingTextView", "aircraftSectionHeaderTextView", "aircraftStatusGroup", "Landroidx/constraintlayout/widget/Group;", "attitudeGroup", "attitudeSectionHeaderTextView", "value", "Landroid/graphics/drawable/Drawable;", "buttonBackground", "getButtonBackground", "()Landroid/graphics/drawable/Drawable;", "setButtonBackground", "(Landroid/graphics/drawable/Drawable;)V", "buttonGroup", "buttonTextColor", "getButtonTextColor", "()I", "setButtonTextColor", "(I)V", "Landroid/content/res/ColorStateList;", "buttonTextColors", "getButtonTextColors", "()Landroid/content/res/ColorStateList;", "setButtonTextColors", "(Landroid/content/res/ColorStateList;)V", "textSize", "", "buttonTextSize", "getButtonTextSize", "()F", "setButtonTextSize", "(F)V", "df", "Ljava/text/DecimalFormat;", "frequencyLabelTextView", "frequencySeekBar", "Ldji/v5/ux/core/ui/HorizontalSeekBar;", "frequencyTextView", "headerBackground", "getHeaderBackground", "setHeaderBackground", "headerTextColor", "getHeaderTextColor", "setHeaderTextColor", "headerTextColors", "getHeaderTextColors", "setHeaderTextColors", "headerTextSize", "getHeaderTextSize", "setHeaderTextSize", "inputBackground", "getInputBackground", "setInputBackground", "inputTextColor", "getInputTextColor", "setInputTextColor", "inputTextColors", "getInputTextColors", "setInputTextColors", "inputTextSize", "getInputTextSize", "setInputTextSize", "", "isAircraftStatusSectionVisible", "()Z", "setAircraftStatusSectionVisible", "(Z)V", "isAttitudeSectionVisible", "setAttitudeSectionVisible", "isWindSectionVisible", "setWindSectionVisible", "isWorldPositionSectionVisible", "setWorldPositionSectionVisible", "labelBackground", "getLabelBackground", "setLabelBackground", "labelTextColor", "getLabelTextColor", "setLabelTextColor", "labelTextColors", "getLabelTextColors", "setLabelTextColors", "labelTextSize", "getLabelTextSize", "setLabelTextSize", "latitudeEditText", "Landroid/widget/EditText;", "latitudeLabelTextView", "latitudeTextView", "loadPresetTextView", "longitudeEditText", "longitudeLabelTextView", "longitudeTextView", "motorsStartedLabelTextView", "motorsStartedTextView", "pitchLabelTextView", "pitchTextView", "positionSectionHeaderTextView", "realWorldPositionGroup", "rollLabelTextView", "rollTextView", "satelliteCountSeekBar", "satelliteLabelTextView", "satelliteTextView", "savePresetTextView", "seekBarChangeListener", "Ldji/v5/ux/core/ui/HorizontalSeekBar$OnSeekBarChangeListener;", "seekBarTextColor", "getSeekBarTextColor", "setSeekBarTextColor", "seekBarThumbIcon", "getSeekBarThumbIcon", "setSeekBarThumbIcon", "seekBarTrackIconBackground", "getSeekBarTrackIconBackground", "setSeekBarTrackIconBackground", "shouldReactToCheckChange", "simulatedLocation", "Ldji/sdk/keyvalue/value/common/LocationCoordinate2D;", "getSimulatedLocation", "()Ldji/sdk/keyvalue/value/common/LocationCoordinate2D;", "simulatorActiveIcon", "getSimulatorActiveIcon", "setSimulatorActiveIcon", "simulatorInactiveIcon", "getSimulatorInactiveIcon", "setSimulatorInactiveIcon", "simulatorSwitch", "Landroid/widget/Switch;", "simulatorTitleTextView", "titleBackground", "getTitleBackground", "setTitleBackground", "titleTextColor", "getTitleTextColor", "setTitleTextColor", "titleTextColors", "getTitleTextColors", "setTitleTextColors", "titleTextSize", "getTitleTextSize", "setTitleTextSize", "uiUpdateStateProcessor", "Lio/reactivex/rxjava3/processors/PublishProcessor;", "Ldji/v5/ux/training/simulatorcontrol/SimulatorControlWidget$UIState;", "valueBackground", "getValueBackground", "setValueBackground", "valueTextColor", "getValueTextColor", "setValueTextColor", "valueTextColors", "getValueTextColors", "setValueTextColors", "valueTextSize", "getValueTextSize", "setValueTextSize", "widgetModel", "Ldji/v5/ux/training/simulatorcontrol/SimulatorControlWidgetModel;", "getWidgetModel", "()Ldji/v5/ux/training/simulatorcontrol/SimulatorControlWidgetModel;", "widgetModel$delegate", "Lkotlin/Lazy;", "windSectionHeaderTextView", "windSimulationGroup", "windSpeedXSeekBar", "windSpeedYSeekBar", "windSpeedZSeekBar", "windXLabelTextView", "windYLabelTextView", "windZLabelTextView", "worldXLabelTextView", "worldXTextView", "worldYLabelTextView", "worldYTextView", "worldZLabelTextView", "worldZTextView", "yawLabelTextView", "yawTextView", "checkAndUpdateState", "", "getIdealDimensionRatioString", "", "getUIStateUpdates", "Lio/reactivex/rxjava3/core/Flowable;", "getWidgetStateUpdate", "handleSwitchChange", "isChecked", "initAttributes", "initView", "initViewElements", "normalizeWindValue", "progress", "onAttachedToWindow", "onClick", "v", "Landroid/view/View;", "onDetachedFromWindow", "onLoadPreset", "simulatorPresetData", "Ldji/v5/ux/training/simulatorcontrol/preset/SimulatorPresetData;", "onProductChanged", "it", "reactToModelChanges", "resourceId", "setButtonTextAppearance", "textAppearance", "setEnabled", "enabled", "setHeaderTextAppearance", "setInputTextAppearance", "setLabelTextAppearance", "setSimulatorStatus", "simulatorActive", "setTitleTextAppearance", "setValueTextAppearance", "setWindSpeedUI", "windDirection", "isPositive", "showPresetListDialog", "showSavePresetDialog", "startSimulator", "stopSimulator", "updateSatelliteCount", "satelliteCount", "updateUI", "isActive", "updateWidgetToStartedState", "updateWidgetToStoppedState", "updateWidgetValues", "simulatorState", "Ldji/sdk/keyvalue/value/flightcontroller/SimulatorState;", "Companion", "ModelState", "UIState", "android-sdk-v5-uxsdk_debug"})
public class SimulatorControlWidget extends dji.v5.ux.core.base.widget.ConstraintLayoutWidget<dji.v5.ux.training.simulatorcontrol.SimulatorControlWidget.ModelState> implements android.view.View.OnClickListener, dji.v5.ux.training.simulatorcontrol.preset.OnLoadPresetListener {
    private final kotlin.Lazy widgetModel$delegate = null;
    private final android.widget.EditText latitudeEditText = null;
    private final android.widget.EditText longitudeEditText = null;
    private final dji.v5.ux.core.ui.HorizontalSeekBar frequencySeekBar = null;
    private final dji.v5.ux.core.ui.HorizontalSeekBar satelliteCountSeekBar = null;
    private final android.widget.TextView simulatorTitleTextView = null;
    private final android.widget.Switch simulatorSwitch = null;
    private final android.widget.TextView latitudeTextView = null;
    private final android.widget.TextView longitudeTextView = null;
    private final android.widget.TextView satelliteTextView = null;
    private final android.widget.TextView worldXTextView = null;
    private final android.widget.TextView worldYTextView = null;
    private final android.widget.TextView worldZTextView = null;
    private final android.widget.TextView motorsStartedTextView = null;
    private final android.widget.TextView aircraftFlyingTextView = null;
    private final android.widget.TextView pitchTextView = null;
    private final android.widget.TextView yawTextView = null;
    private final android.widget.TextView rollTextView = null;
    private final android.widget.TextView frequencyTextView = null;
    private final android.widget.TextView loadPresetTextView = null;
    private final android.widget.TextView savePresetTextView = null;
    private final android.widget.TextView latitudeLabelTextView = null;
    private final android.widget.TextView longitudeLabelTextView = null;
    private final android.widget.TextView satelliteLabelTextView = null;
    private final android.widget.TextView worldXLabelTextView = null;
    private final android.widget.TextView worldYLabelTextView = null;
    private final android.widget.TextView worldZLabelTextView = null;
    private final android.widget.TextView motorsStartedLabelTextView = null;
    private final android.widget.TextView aircraftFlyingLabelTextView = null;
    private final android.widget.TextView pitchLabelTextView = null;
    private final android.widget.TextView yawLabelTextView = null;
    private final android.widget.TextView rollLabelTextView = null;
    private final android.widget.TextView frequencyLabelTextView = null;
    private final android.widget.TextView windXLabelTextView = null;
    private final android.widget.TextView windYLabelTextView = null;
    private final android.widget.TextView windZLabelTextView = null;
    private final dji.v5.ux.core.ui.HorizontalSeekBar windSpeedXSeekBar = null;
    private final dji.v5.ux.core.ui.HorizontalSeekBar windSpeedYSeekBar = null;
    private final dji.v5.ux.core.ui.HorizontalSeekBar windSpeedZSeekBar = null;
    private final android.widget.TextView positionSectionHeaderTextView = null;
    private final android.widget.TextView windSectionHeaderTextView = null;
    private final android.widget.TextView attitudeSectionHeaderTextView = null;
    private final android.widget.TextView aircraftSectionHeaderTextView = null;
    private final androidx.constraintlayout.widget.Group attitudeGroup = null;
    private final androidx.constraintlayout.widget.Group aircraftStatusGroup = null;
    private final androidx.constraintlayout.widget.Group realWorldPositionGroup = null;
    private final androidx.constraintlayout.widget.Group windSimulationGroup = null;
    private final androidx.constraintlayout.widget.Group buttonGroup = null;
    private java.text.DecimalFormat df;
    private boolean shouldReactToCheckChange = false;
    private final dji.v5.ux.core.ui.HorizontalSeekBar.OnSeekBarChangeListener seekBarChangeListener = null;
    private final io.reactivex.rxjava3.processors.PublishProcessor<dji.v5.ux.training.simulatorcontrol.SimulatorControlWidget.UIState> uiUpdateStateProcessor = null;
    
    /**
     * The drawable resource for the simulator active icon
     */
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable simulatorActiveIcon;
    
    /**
     * The drawable resource for the simulator inactive icon
     */
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable simulatorInactiveIcon;
    
    /**
     * Visibility of the world position section
     */
    private boolean isWorldPositionSectionVisible = true;
    
    /**
     * Visibility of the attitude section
     */
    private boolean isAttitudeSectionVisible = true;
    
    /**
     * Visibility of the aircraft status section
     */
    private boolean isAircraftStatusSectionVisible = true;
    
    /**
     * Visibility of the wind section
     */
    private boolean isWindSectionVisible = true;
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.training.simulatorcontrol.SimulatorControlWidget.Companion Companion = null;
    private static final java.lang.String TAG = "SimulatorCtlWidget";
    private static final int WIND_DIRECTION_X = 0;
    private static final int WIND_DIRECTION_Y = 1;
    private static final int WIND_DIRECTION_Z = 2;
    private static final int MIN_FREQUENCY = 2;
    private static final int DEFAULT_FREQUENCY = 20;
    private static final int SIMULATION_MIN_WIND_SPEED = -20;
    private static final int SIMULATION_MAX_WIND_SPEED = 20;
    private static final int WIND_SEEK_BAR_MAX = 40;
    
    @kotlin.jvm.JvmOverloads
    public SimulatorControlWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public SimulatorControlWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public SimulatorControlWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    private final dji.v5.ux.training.simulatorcontrol.SimulatorControlWidgetModel getWidgetModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getSimulatorActiveIcon() {
        return null;
    }
    
    public final void setSimulatorActiveIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getSimulatorInactiveIcon() {
        return null;
    }
    
    public final void setSimulatorInactiveIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    public final boolean isWorldPositionSectionVisible() {
        return false;
    }
    
    public final void setWorldPositionSectionVisible(boolean value) {
    }
    
    public final boolean isAttitudeSectionVisible() {
        return false;
    }
    
    public final void setAttitudeSectionVisible(boolean value) {
    }
    
    public final boolean isAircraftStatusSectionVisible() {
        return false;
    }
    
    public final void setAircraftStatusSectionVisible(boolean value) {
    }
    
    public final boolean isWindSectionVisible() {
        return false;
    }
    
    public final void setWindSectionVisible(boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getTitleBackground() {
        return null;
    }
    
    public final void setTitleBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.content.res.ColorStateList getTitleTextColors() {
        return null;
    }
    
    public final void setTitleTextColors(@org.jetbrains.annotations.Nullable
    android.content.res.ColorStateList value) {
    }
    
    public final int getTitleTextColor() {
        return 0;
    }
    
    public final void setTitleTextColor(int value) {
    }
    
    public final float getTitleTextSize() {
        return 0.0F;
    }
    
    public final void setTitleTextSize(float textSize) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.content.res.ColorStateList getValueTextColors() {
        return null;
    }
    
    public final void setValueTextColors(@org.jetbrains.annotations.Nullable
    android.content.res.ColorStateList value) {
    }
    
    public final int getValueTextColor() {
        return 0;
    }
    
    public final void setValueTextColor(int value) {
    }
    
    public final float getValueTextSize() {
        return 0.0F;
    }
    
    public final void setValueTextSize(float textSize) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getValueBackground() {
        return null;
    }
    
    public final void setValueBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    public final float getLabelTextSize() {
        return 0.0F;
    }
    
    public final void setLabelTextSize(float textSize) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.content.res.ColorStateList getLabelTextColors() {
        return null;
    }
    
    public final void setLabelTextColors(@org.jetbrains.annotations.Nullable
    android.content.res.ColorStateList value) {
    }
    
    public final int getLabelTextColor() {
        return 0;
    }
    
    public final void setLabelTextColor(int value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getLabelBackground() {
        return null;
    }
    
    public final void setLabelBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    public final float getInputTextSize() {
        return 0.0F;
    }
    
    public final void setInputTextSize(float textSize) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.content.res.ColorStateList getInputTextColors() {
        return null;
    }
    
    public final void setInputTextColors(@org.jetbrains.annotations.Nullable
    android.content.res.ColorStateList value) {
    }
    
    public final int getInputTextColor() {
        return 0;
    }
    
    public final void setInputTextColor(int value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getInputBackground() {
        return null;
    }
    
    public final void setInputBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    public final float getButtonTextSize() {
        return 0.0F;
    }
    
    public final void setButtonTextSize(float textSize) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.content.res.ColorStateList getButtonTextColors() {
        return null;
    }
    
    public final void setButtonTextColors(@org.jetbrains.annotations.Nullable
    android.content.res.ColorStateList value) {
    }
    
    public final int getButtonTextColor() {
        return 0;
    }
    
    public final void setButtonTextColor(int value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getButtonBackground() {
        return null;
    }
    
    public final void setButtonBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    public final float getHeaderTextSize() {
        return 0.0F;
    }
    
    public final void setHeaderTextSize(float textSize) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.content.res.ColorStateList getHeaderTextColors() {
        return null;
    }
    
    public final void setHeaderTextColors(@org.jetbrains.annotations.Nullable
    android.content.res.ColorStateList value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getHeaderBackground() {
        return null;
    }
    
    public final void setHeaderBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    public final int getHeaderTextColor() {
        return 0;
    }
    
    public final void setHeaderTextColor(int value) {
    }
    
    public final int getSeekBarTextColor() {
        return 0;
    }
    
    public final void setSeekBarTextColor(int value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getSeekBarTrackIconBackground() {
        return null;
    }
    
    public final void setSeekBarTrackIconBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getSeekBarThumbIcon() {
        return null;
    }
    
    public final void setSeekBarThumbIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @java.lang.Override
    protected void initView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
    }
    
    @java.lang.Override
    protected void reactToModelChanges() {
    }
    
    private final void onProductChanged(boolean it) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getIdealDimensionRatioString() {
        return null;
    }
    
    @java.lang.Override
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override
    protected void onDetachedFromWindow() {
    }
    
    @java.lang.Override
    public void onLoadPreset(@org.jetbrains.annotations.Nullable
    dji.v5.ux.training.simulatorcontrol.preset.SimulatorPresetData simulatorPresetData) {
    }
    
    @java.lang.Override
    public void onClick(@org.jetbrains.annotations.NotNull
    android.view.View v) {
    }
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    private final void initAttributes(android.content.Context context, android.util.AttributeSet attrs) {
    }
    
    private final void setWindSpeedUI(int windDirection, boolean isPositive) {
    }
    
    private final void updateSatelliteCount(int satelliteCount) {
    }
    
    private final void updateUI(boolean isActive) {
    }
    
    private final void checkAndUpdateState() {
    }
    
    private final void initViewElements() {
    }
    
    private final int normalizeWindValue(int progress) {
        return 0;
    }
    
    private final void handleSwitchChange(boolean isChecked) {
    }
    
    private final void stopSimulator() {
    }
    
    private final void startSimulator() {
    }
    
    private final void setSimulatorStatus(boolean simulatorActive) {
    }
    
    private final void updateWidgetToStartedState() {
    }
    
    private final void updateWidgetToStoppedState() {
    }
    
    private final void updateWidgetValues(dji.sdk.keyvalue.value.flightcontroller.SimulatorState simulatorState) {
    }
    
    private final dji.sdk.keyvalue.value.common.LocationCoordinate2D getSimulatedLocation() {
        return null;
    }
    
    private final void showSavePresetDialog() {
    }
    
    private final void showPresetListDialog() {
    }
    
    @java.lang.Override
    public void setEnabled(boolean enabled) {
    }
    
    /**
     * Set background to title text
     *
     * @param resourceId of resource to be used as background of title
     */
    public final void setTitleBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the resource ID for the simulator active icon
     *
     * @param resourceId Integer ID of the drawable resource
     */
    public final void setSimulatorActiveIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the resource ID for the simulator inactive icon
     *
     * @param resourceId Integer ID of the drawable resource
     */
    public final void setSimulatorInactiveIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set text appearance of the widget title
     *
     * @param textAppearance resourceId for text appearance for title
     */
    public final void setTitleTextAppearance(@androidx.annotation.StyleRes
    int textAppearance) {
    }
    
    /**
     * Set text appearance of the value fields
     *
     * @param textAppearance resourceId for text appearance of value fields
     */
    public final void setValueTextAppearance(@androidx.annotation.StyleRes
    int textAppearance) {
    }
    
    /**
     * Set background resource to value text
     *
     * @param resourceId to use as background for value fields
     */
    public final void setValueBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set text appearance of the widget labels
     *
     * @param textAppearance resource id of text appearance for label text
     */
    public final void setLabelTextAppearance(@androidx.annotation.StyleRes
    int textAppearance) {
    }
    
    /**
     * Set background to label text
     *
     * @param resourceId to use as background for all labels
     */
    public final void setLabelBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set text appearance of the widget input text fields
     *
     * @param textAppearance resourceId for text appearance of input text fields
     */
    public final void setInputTextAppearance(@androidx.annotation.StyleRes
    int textAppearance) {
    }
    
    /**
     * Set background to input text fields
     *
     * @param resourceId to use as background to input fields
     */
    public final void setInputBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set text appearance of the widget button
     *
     * @param textAppearance resourceId for text appearance for buttons
     */
    public final void setButtonTextAppearance(@androidx.annotation.StyleRes
    int textAppearance) {
    }
    
    /**
     * Set background resource to button
     *
     * @param resourceId to use as background for buttons
     */
    public final void setButtonBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set text appearance of the widget header text fields
     *
     * @param textAppearance resourceId for text appearance of header text fields
     */
    public final void setHeaderTextAppearance(@androidx.annotation.StyleRes
    int textAppearance) {
    }
    
    /**
     * Set background to header text fields
     *
     * @param resourceId to use as background to header fields
     */
    public final void setHeaderBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Get the [UIState] updates
     */
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.training.simulatorcontrol.SimulatorControlWidget.UIState> getUIStateUpdates() {
        return null;
    }
    
    /**
     * Get the [ModelState] updates
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.SuppressWarnings(value = {})
    @java.lang.Override
    public io.reactivex.rxjava3.core.Flowable<dji.v5.ux.training.simulatorcontrol.SimulatorControlWidget.ModelState> getWidgetStateUpdate() {
        return null;
    }
    
    /**
     * Class defines widget state updates
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Ldji/v5/ux/training/simulatorcontrol/SimulatorControlWidget$ModelState;", "", "()V", "ProductConnected", "SimulatorActiveUpdated", "SimulatorStateUpdated", "Ldji/v5/ux/training/simulatorcontrol/SimulatorControlWidget$ModelState$ProductConnected;", "Ldji/v5/ux/training/simulatorcontrol/SimulatorControlWidget$ModelState$SimulatorActiveUpdated;", "Ldji/v5/ux/training/simulatorcontrol/SimulatorControlWidget$ModelState$SimulatorStateUpdated;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class ModelState {
        
        private ModelState() {
            super();
        }
        
        /**
         * Product connection update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/training/simulatorcontrol/SimulatorControlWidget$ModelState$ProductConnected;", "Ldji/v5/ux/training/simulatorcontrol/SimulatorControlWidget$ModelState;", "isConnected", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductConnected extends dji.v5.ux.training.simulatorcontrol.SimulatorControlWidget.ModelState {
            private final boolean isConnected = false;
            
            /**
             * Product connection update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.training.simulatorcontrol.SimulatorControlWidget.ModelState.ProductConnected copy(boolean isConnected) {
                return null;
            }
            
            /**
             * Product connection update
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Product connection update
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Product connection update
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public ProductConnected(boolean isConnected) {
                super();
            }
            
            public final boolean component1() {
                return false;
            }
            
            public final boolean isConnected() {
                return false;
            }
        }
        
        /**
         * Simulator state update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/training/simulatorcontrol/SimulatorControlWidget$ModelState$SimulatorStateUpdated;", "Ldji/v5/ux/training/simulatorcontrol/SimulatorControlWidget$ModelState;", "simulatorState", "Ldji/sdk/keyvalue/value/flightcontroller/SimulatorState;", "(Ldji/sdk/keyvalue/value/flightcontroller/SimulatorState;)V", "getSimulatorState", "()Ldji/sdk/keyvalue/value/flightcontroller/SimulatorState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class SimulatorStateUpdated extends dji.v5.ux.training.simulatorcontrol.SimulatorControlWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            private final dji.sdk.keyvalue.value.flightcontroller.SimulatorState simulatorState = null;
            
            /**
             * Simulator state update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.training.simulatorcontrol.SimulatorControlWidget.ModelState.SimulatorStateUpdated copy(@org.jetbrains.annotations.NotNull
            dji.sdk.keyvalue.value.flightcontroller.SimulatorState simulatorState) {
                return null;
            }
            
            /**
             * Simulator state update
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Simulator state update
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Simulator state update
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public SimulatorStateUpdated(@org.jetbrains.annotations.NotNull
            dji.sdk.keyvalue.value.flightcontroller.SimulatorState simulatorState) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.sdk.keyvalue.value.flightcontroller.SimulatorState component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.sdk.keyvalue.value.flightcontroller.SimulatorState getSimulatorState() {
                return null;
            }
        }
        
        /**
         * Simulator active/inactive update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/training/simulatorcontrol/SimulatorControlWidget$ModelState$SimulatorActiveUpdated;", "Ldji/v5/ux/training/simulatorcontrol/SimulatorControlWidget$ModelState;", "isActive", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class SimulatorActiveUpdated extends dji.v5.ux.training.simulatorcontrol.SimulatorControlWidget.ModelState {
            private final boolean isActive = false;
            
            /**
             * Simulator active/inactive update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.training.simulatorcontrol.SimulatorControlWidget.ModelState.SimulatorActiveUpdated copy(boolean isActive) {
                return null;
            }
            
            /**
             * Simulator active/inactive update
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Simulator active/inactive update
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Simulator active/inactive update
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public SimulatorActiveUpdated(boolean isActive) {
                super();
            }
            
            public final boolean component1() {
                return false;
            }
            
            public final boolean isActive() {
                return false;
            }
        }
    }
    
    /**
     * Class defines the widget UI updates
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Ldji/v5/ux/training/simulatorcontrol/SimulatorControlWidget$UIState;", "", "()V", "LoadPresetClicked", "SavePresetClicked", "SimulatorSwitchTap", "SimulatorWindChangeClicked", "VisibilityUpdated", "Ldji/v5/ux/training/simulatorcontrol/SimulatorControlWidget$UIState$LoadPresetClicked;", "Ldji/v5/ux/training/simulatorcontrol/SimulatorControlWidget$UIState$SavePresetClicked;", "Ldji/v5/ux/training/simulatorcontrol/SimulatorControlWidget$UIState$SimulatorSwitchTap;", "Ldji/v5/ux/training/simulatorcontrol/SimulatorControlWidget$UIState$SimulatorWindChangeClicked;", "Ldji/v5/ux/training/simulatorcontrol/SimulatorControlWidget$UIState$VisibilityUpdated;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class UIState {
        
        private UIState() {
            super();
        }
        
        /**
         * Update when widget visibility is toggled
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/training/simulatorcontrol/SimulatorControlWidget$UIState$VisibilityUpdated;", "Ldji/v5/ux/training/simulatorcontrol/SimulatorControlWidget$UIState;", "isVisible", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class VisibilityUpdated extends dji.v5.ux.training.simulatorcontrol.SimulatorControlWidget.UIState {
            private final boolean isVisible = false;
            
            /**
             * Update when widget visibility is toggled
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.training.simulatorcontrol.SimulatorControlWidget.UIState.VisibilityUpdated copy(boolean isVisible) {
                return null;
            }
            
            /**
             * Update when widget visibility is toggled
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Update when widget visibility is toggled
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Update when widget visibility is toggled
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public VisibilityUpdated(boolean isVisible) {
                super();
            }
            
            public final boolean component1() {
                return false;
            }
            
            public final boolean isVisible() {
                return false;
            }
        }
        
        /**
         * Update when load preset button is tapped
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/training/simulatorcontrol/SimulatorControlWidget$UIState$LoadPresetClicked;", "Ldji/v5/ux/training/simulatorcontrol/SimulatorControlWidget$UIState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class LoadPresetClicked extends dji.v5.ux.training.simulatorcontrol.SimulatorControlWidget.UIState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.training.simulatorcontrol.SimulatorControlWidget.UIState.LoadPresetClicked INSTANCE = null;
            
            private LoadPresetClicked() {
                super();
            }
        }
        
        /**
         * Update when save preset button is tapped
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/training/simulatorcontrol/SimulatorControlWidget$UIState$SavePresetClicked;", "Ldji/v5/ux/training/simulatorcontrol/SimulatorControlWidget$UIState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class SavePresetClicked extends dji.v5.ux.training.simulatorcontrol.SimulatorControlWidget.UIState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.training.simulatorcontrol.SimulatorControlWidget.UIState.SavePresetClicked INSTANCE = null;
            
            private SavePresetClicked() {
                super();
            }
        }
        
        /**
         * Update when start/stop simulator switch is tapped
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/training/simulatorcontrol/SimulatorControlWidget$UIState$SimulatorSwitchTap;", "Ldji/v5/ux/training/simulatorcontrol/SimulatorControlWidget$UIState;", "isChecked", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class SimulatorSwitchTap extends dji.v5.ux.training.simulatorcontrol.SimulatorControlWidget.UIState {
            private final boolean isChecked = false;
            
            /**
             * Update when start/stop simulator switch is tapped
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.training.simulatorcontrol.SimulatorControlWidget.UIState.SimulatorSwitchTap copy(boolean isChecked) {
                return null;
            }
            
            /**
             * Update when start/stop simulator switch is tapped
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Update when start/stop simulator switch is tapped
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Update when start/stop simulator switch is tapped
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public SimulatorSwitchTap(boolean isChecked) {
                super();
            }
            
            public final boolean component1() {
                return false;
            }
            
            public final boolean isChecked() {
                return false;
            }
        }
        
        /**
         * Update when simulator wind variation button tapped
         * Wind direction
         * 0 - X
         * 1 - Y
         * 2 - Z
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0013"}, d2 = {"Ldji/v5/ux/training/simulatorcontrol/SimulatorControlWidget$UIState$SimulatorWindChangeClicked;", "Ldji/v5/ux/training/simulatorcontrol/SimulatorControlWidget$UIState;", "windDirection", "", "isPositive", "", "(IZ)V", "()Z", "getWindDirection", "()I", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class SimulatorWindChangeClicked extends dji.v5.ux.training.simulatorcontrol.SimulatorControlWidget.UIState {
            private final int windDirection = 0;
            private final boolean isPositive = false;
            
            /**
             * Update when simulator wind variation button tapped
             * Wind direction
             * 0 - X
             * 1 - Y
             * 2 - Z
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.training.simulatorcontrol.SimulatorControlWidget.UIState.SimulatorWindChangeClicked copy(@androidx.annotation.IntRange(from = 0L, to = 2L)
            int windDirection, boolean isPositive) {
                return null;
            }
            
            /**
             * Update when simulator wind variation button tapped
             * Wind direction
             * 0 - X
             * 1 - Y
             * 2 - Z
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Update when simulator wind variation button tapped
             * Wind direction
             * 0 - X
             * 1 - Y
             * 2 - Z
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Update when simulator wind variation button tapped
             * Wind direction
             * 0 - X
             * 1 - Y
             * 2 - Z
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public SimulatorWindChangeClicked(@androidx.annotation.IntRange(from = 0L, to = 2L)
            int windDirection, boolean isPositive) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            public final int getWindDirection() {
                return 0;
            }
            
            public final boolean component2() {
                return false;
            }
            
            public final boolean isPositive() {
                return false;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Ldji/v5/ux/training/simulatorcontrol/SimulatorControlWidget$Companion;", "", "()V", "DEFAULT_FREQUENCY", "", "MIN_FREQUENCY", "SIMULATION_MAX_WIND_SPEED", "SIMULATION_MIN_WIND_SPEED", "TAG", "", "WIND_DIRECTION_X", "WIND_DIRECTION_Y", "WIND_DIRECTION_Z", "WIND_SEEK_BAR_MAX", "android-sdk-v5-uxsdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}