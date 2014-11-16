package br.edu.ufsc.compilador.analisadores;

public interface ScannerConstants
{
    int[] SCANNER_TABLE_INDEXES = 
    {
        0,
        85,
        89,
        281,
        281,
        281,
        281,
        281,
        281,
        281,
        282,
        284,
        299,
        300,
        300,
        302,
        302,
        303,
        365,
        430,
        430,
        430,
        430,
        430,
        622,
        622,
        814,
        1006,
        1008,
        1018,
        1028,
        1028,
        1028,
        1028,
        1028,
        1090,
        1282,
        1282,
        1296,
        1306,
        1498,
        1500,
        1510,
        1520,
        1530,
        1540
    };

    int[][] SCANNER_TABLE = 
    {
        {9, 1},
        {10, 1},
        {13, 1},
        {32, 1},
        {39, 2},
        {40, 3},
        {41, 4},
        {42, 5},
        {43, 6},
        {44, 7},
        {45, 8},
        {46, 9},
        {47, 10},
        {48, 11},
        {49, 11},
        {50, 11},
        {51, 11},
        {52, 11},
        {53, 11},
        {54, 11},
        {55, 11},
        {56, 11},
        {57, 11},
        {58, 12},
        {59, 13},
        {60, 14},
        {61, 15},
        {62, 16},
        {64, 17},
        {65, 18},
        {66, 18},
        {67, 18},
        {68, 18},
        {69, 18},
        {70, 18},
        {71, 18},
        {72, 18},
        {73, 18},
        {74, 18},
        {75, 18},
        {76, 18},
        {77, 18},
        {78, 18},
        {79, 18},
        {80, 18},
        {81, 18},
        {82, 18},
        {83, 18},
        {84, 18},
        {85, 18},
        {86, 18},
        {87, 18},
        {88, 18},
        {89, 18},
        {90, 18},
        {91, 19},
        {93, 20},
        {97, 18},
        {98, 18},
        {99, 18},
        {100, 18},
        {101, 18},
        {102, 18},
        {103, 18},
        {104, 18},
        {105, 18},
        {106, 18},
        {107, 18},
        {108, 18},
        {109, 18},
        {110, 18},
        {111, 18},
        {112, 18},
        {113, 18},
        {114, 18},
        {115, 18},
        {116, 18},
        {117, 18},
        {118, 18},
        {119, 18},
        {120, 18},
        {121, 18},
        {122, 18},
        {123, 21},
        {125, 22},
        {9, 1},
        {10, 1},
        {13, 1},
        {32, 1},
        {9, 2},
        {10, 2},
        {32, 2},
        {33, 2},
        {34, 2},
        {35, 2},
        {36, 2},
        {37, 2},
        {38, 2},
        {39, 23},
        {40, 2},
        {41, 2},
        {42, 2},
        {43, 2},
        {44, 2},
        {45, 2},
        {46, 2},
        {47, 2},
        {48, 2},
        {49, 2},
        {50, 2},
        {51, 2},
        {52, 2},
        {53, 2},
        {54, 2},
        {55, 2},
        {56, 2},
        {57, 2},
        {58, 2},
        {59, 2},
        {60, 2},
        {61, 2},
        {62, 2},
        {63, 2},
        {64, 2},
        {65, 2},
        {66, 2},
        {67, 2},
        {68, 2},
        {69, 2},
        {70, 2},
        {71, 2},
        {72, 2},
        {73, 2},
        {74, 2},
        {75, 2},
        {76, 2},
        {77, 2},
        {78, 2},
        {79, 2},
        {80, 2},
        {81, 2},
        {82, 2},
        {83, 2},
        {84, 2},
        {85, 2},
        {86, 2},
        {87, 2},
        {88, 2},
        {89, 2},
        {90, 2},
        {91, 2},
        {92, 2},
        {93, 2},
        {94, 2},
        {95, 2},
        {96, 2},
        {97, 2},
        {98, 2},
        {99, 2},
        {100, 2},
        {101, 2},
        {102, 2},
        {103, 2},
        {104, 2},
        {105, 2},
        {106, 2},
        {107, 2},
        {108, 2},
        {109, 2},
        {110, 2},
        {111, 2},
        {112, 2},
        {113, 2},
        {114, 2},
        {115, 2},
        {116, 2},
        {117, 2},
        {118, 2},
        {119, 2},
        {120, 2},
        {121, 2},
        {122, 2},
        {123, 2},
        {124, 2},
        {125, 2},
        {126, 2},
        {161, 2},
        {162, 2},
        {163, 2},
        {164, 2},
        {165, 2},
        {166, 2},
        {167, 2},
        {168, 2},
        {169, 2},
        {170, 2},
        {171, 2},
        {172, 2},
        {173, 2},
        {174, 2},
        {175, 2},
        {176, 2},
        {177, 2},
        {178, 2},
        {179, 2},
        {180, 2},
        {181, 2},
        {182, 2},
        {183, 2},
        {184, 2},
        {185, 2},
        {186, 2},
        {187, 2},
        {188, 2},
        {189, 2},
        {190, 2},
        {191, 2},
        {192, 2},
        {193, 2},
        {194, 2},
        {195, 2},
        {196, 2},
        {197, 2},
        {198, 2},
        {199, 2},
        {200, 2},
        {201, 2},
        {202, 2},
        {203, 2},
        {204, 2},
        {205, 2},
        {206, 2},
        {207, 2},
        {208, 2},
        {209, 2},
        {210, 2},
        {211, 2},
        {212, 2},
        {213, 2},
        {214, 2},
        {215, 2},
        {216, 2},
        {217, 2},
        {218, 2},
        {219, 2},
        {220, 2},
        {221, 2},
        {222, 2},
        {223, 2},
        {224, 2},
        {225, 2},
        {226, 2},
        {227, 2},
        {228, 2},
        {229, 2},
        {230, 2},
        {231, 2},
        {232, 2},
        {233, 2},
        {234, 2},
        {235, 2},
        {236, 2},
        {237, 2},
        {238, 2},
        {239, 2},
        {240, 2},
        {241, 2},
        {242, 2},
        {243, 2},
        {244, 2},
        {245, 2},
        {246, 2},
        {247, 2},
        {248, 2},
        {249, 2},
        {250, 2},
        {251, 2},
        {252, 2},
        {253, 2},
        {254, 2},
        {255, 2},
        {46, 24},
        {42, 25},
        {47, 26},
        {43, 27},
        {45, 27},
        {46, 28},
        {48, 11},
        {49, 11},
        {50, 11},
        {51, 11},
        {52, 11},
        {53, 11},
        {54, 11},
        {55, 11},
        {56, 11},
        {57, 11},
        {69, 29},
        {101, 29},
        {61, 30},
        {61, 31},
        {62, 32},
        {61, 33},
        {48, 18},
        {49, 18},
        {50, 18},
        {51, 18},
        {52, 18},
        {53, 18},
        {54, 18},
        {55, 18},
        {56, 18},
        {57, 18},
        {65, 18},
        {66, 18},
        {67, 18},
        {68, 18},
        {69, 18},
        {70, 18},
        {71, 18},
        {72, 18},
        {73, 18},
        {74, 18},
        {75, 18},
        {76, 18},
        {77, 18},
        {78, 18},
        {79, 18},
        {80, 18},
        {81, 18},
        {82, 18},
        {83, 18},
        {84, 18},
        {85, 18},
        {86, 18},
        {87, 18},
        {88, 18},
        {89, 18},
        {90, 18},
        {97, 18},
        {98, 18},
        {99, 18},
        {100, 18},
        {101, 18},
        {102, 18},
        {103, 18},
        {104, 18},
        {105, 18},
        {106, 18},
        {107, 18},
        {108, 18},
        {109, 18},
        {110, 18},
        {111, 18},
        {112, 18},
        {113, 18},
        {114, 18},
        {115, 18},
        {116, 18},
        {117, 18},
        {118, 18},
        {119, 18},
        {120, 18},
        {121, 18},
        {122, 18},
        {35, 34},
        {48, 18},
        {49, 18},
        {50, 18},
        {51, 18},
        {52, 18},
        {53, 18},
        {54, 18},
        {55, 18},
        {56, 18},
        {57, 18},
        {64, 34},
        {65, 18},
        {66, 18},
        {67, 18},
        {68, 18},
        {69, 18},
        {70, 18},
        {71, 18},
        {72, 18},
        {73, 18},
        {74, 18},
        {75, 18},
        {76, 18},
        {77, 18},
        {78, 18},
        {79, 18},
        {80, 18},
        {81, 18},
        {82, 18},
        {83, 18},
        {84, 18},
        {85, 18},
        {86, 18},
        {87, 18},
        {88, 18},
        {89, 18},
        {90, 18},
        {95, 34},
        {97, 18},
        {98, 18},
        {99, 18},
        {100, 18},
        {101, 18},
        {102, 18},
        {103, 18},
        {104, 18},
        {105, 18},
        {106, 18},
        {107, 18},
        {108, 18},
        {109, 18},
        {110, 18},
        {111, 18},
        {112, 18},
        {113, 18},
        {114, 18},
        {115, 18},
        {116, 18},
        {117, 18},
        {118, 18},
        {119, 18},
        {120, 18},
        {121, 18},
        {122, 18},
        {9, 2},
        {10, 2},
        {32, 2},
        {33, 2},
        {34, 2},
        {35, 2},
        {36, 2},
        {37, 2},
        {38, 2},
        {39, 23},
        {40, 2},
        {41, 2},
        {42, 2},
        {43, 2},
        {44, 2},
        {45, 2},
        {46, 2},
        {47, 2},
        {48, 2},
        {49, 2},
        {50, 2},
        {51, 2},
        {52, 2},
        {53, 2},
        {54, 2},
        {55, 2},
        {56, 2},
        {57, 2},
        {58, 2},
        {59, 2},
        {60, 2},
        {61, 2},
        {62, 2},
        {63, 2},
        {64, 2},
        {65, 2},
        {66, 2},
        {67, 2},
        {68, 2},
        {69, 2},
        {70, 2},
        {71, 2},
        {72, 2},
        {73, 2},
        {74, 2},
        {75, 2},
        {76, 2},
        {77, 2},
        {78, 2},
        {79, 2},
        {80, 2},
        {81, 2},
        {82, 2},
        {83, 2},
        {84, 2},
        {85, 2},
        {86, 2},
        {87, 2},
        {88, 2},
        {89, 2},
        {90, 2},
        {91, 2},
        {92, 2},
        {93, 2},
        {94, 2},
        {95, 2},
        {96, 2},
        {97, 2},
        {98, 2},
        {99, 2},
        {100, 2},
        {101, 2},
        {102, 2},
        {103, 2},
        {104, 2},
        {105, 2},
        {106, 2},
        {107, 2},
        {108, 2},
        {109, 2},
        {110, 2},
        {111, 2},
        {112, 2},
        {113, 2},
        {114, 2},
        {115, 2},
        {116, 2},
        {117, 2},
        {118, 2},
        {119, 2},
        {120, 2},
        {121, 2},
        {122, 2},
        {123, 2},
        {124, 2},
        {125, 2},
        {126, 2},
        {161, 2},
        {162, 2},
        {163, 2},
        {164, 2},
        {165, 2},
        {166, 2},
        {167, 2},
        {168, 2},
        {169, 2},
        {170, 2},
        {171, 2},
        {172, 2},
        {173, 2},
        {174, 2},
        {175, 2},
        {176, 2},
        {177, 2},
        {178, 2},
        {179, 2},
        {180, 2},
        {181, 2},
        {182, 2},
        {183, 2},
        {184, 2},
        {185, 2},
        {186, 2},
        {187, 2},
        {188, 2},
        {189, 2},
        {190, 2},
        {191, 2},
        {192, 2},
        {193, 2},
        {194, 2},
        {195, 2},
        {196, 2},
        {197, 2},
        {198, 2},
        {199, 2},
        {200, 2},
        {201, 2},
        {202, 2},
        {203, 2},
        {204, 2},
        {205, 2},
        {206, 2},
        {207, 2},
        {208, 2},
        {209, 2},
        {210, 2},
        {211, 2},
        {212, 2},
        {213, 2},
        {214, 2},
        {215, 2},
        {216, 2},
        {217, 2},
        {218, 2},
        {219, 2},
        {220, 2},
        {221, 2},
        {222, 2},
        {223, 2},
        {224, 2},
        {225, 2},
        {226, 2},
        {227, 2},
        {228, 2},
        {229, 2},
        {230, 2},
        {231, 2},
        {232, 2},
        {233, 2},
        {234, 2},
        {235, 2},
        {236, 2},
        {237, 2},
        {238, 2},
        {239, 2},
        {240, 2},
        {241, 2},
        {242, 2},
        {243, 2},
        {244, 2},
        {245, 2},
        {246, 2},
        {247, 2},
        {248, 2},
        {249, 2},
        {250, 2},
        {251, 2},
        {252, 2},
        {253, 2},
        {254, 2},
        {255, 2},
        {9, 25},
        {10, 25},
        {32, 25},
        {33, 25},
        {34, 25},
        {35, 25},
        {36, 25},
        {37, 25},
        {38, 25},
        {39, 25},
        {40, 25},
        {41, 25},
        {42, 35},
        {43, 25},
        {44, 25},
        {45, 25},
        {46, 25},
        {47, 25},
        {48, 25},
        {49, 25},
        {50, 25},
        {51, 25},
        {52, 25},
        {53, 25},
        {54, 25},
        {55, 25},
        {56, 25},
        {57, 25},
        {58, 25},
        {59, 25},
        {60, 25},
        {61, 25},
        {62, 25},
        {63, 25},
        {64, 25},
        {65, 25},
        {66, 25},
        {67, 25},
        {68, 25},
        {69, 25},
        {70, 25},
        {71, 25},
        {72, 25},
        {73, 25},
        {74, 25},
        {75, 25},
        {76, 25},
        {77, 25},
        {78, 25},
        {79, 25},
        {80, 25},
        {81, 25},
        {82, 25},
        {83, 25},
        {84, 25},
        {85, 25},
        {86, 25},
        {87, 25},
        {88, 25},
        {89, 25},
        {90, 25},
        {91, 25},
        {92, 25},
        {93, 25},
        {94, 25},
        {95, 25},
        {96, 25},
        {97, 25},
        {98, 25},
        {99, 25},
        {100, 25},
        {101, 25},
        {102, 25},
        {103, 25},
        {104, 25},
        {105, 25},
        {106, 25},
        {107, 25},
        {108, 25},
        {109, 25},
        {110, 25},
        {111, 25},
        {112, 25},
        {113, 25},
        {114, 25},
        {115, 25},
        {116, 25},
        {117, 25},
        {118, 25},
        {119, 25},
        {120, 25},
        {121, 25},
        {122, 25},
        {123, 25},
        {124, 25},
        {125, 25},
        {126, 25},
        {161, 25},
        {162, 25},
        {163, 25},
        {164, 25},
        {165, 25},
        {166, 25},
        {167, 25},
        {168, 25},
        {169, 25},
        {170, 25},
        {171, 25},
        {172, 25},
        {173, 25},
        {174, 25},
        {175, 25},
        {176, 25},
        {177, 25},
        {178, 25},
        {179, 25},
        {180, 25},
        {181, 25},
        {182, 25},
        {183, 25},
        {184, 25},
        {185, 25},
        {186, 25},
        {187, 25},
        {188, 25},
        {189, 25},
        {190, 25},
        {191, 25},
        {192, 25},
        {193, 25},
        {194, 25},
        {195, 25},
        {196, 25},
        {197, 25},
        {198, 25},
        {199, 25},
        {200, 25},
        {201, 25},
        {202, 25},
        {203, 25},
        {204, 25},
        {205, 25},
        {206, 25},
        {207, 25},
        {208, 25},
        {209, 25},
        {210, 25},
        {211, 25},
        {212, 25},
        {213, 25},
        {214, 25},
        {215, 25},
        {216, 25},
        {217, 25},
        {218, 25},
        {219, 25},
        {220, 25},
        {221, 25},
        {222, 25},
        {223, 25},
        {224, 25},
        {225, 25},
        {226, 25},
        {227, 25},
        {228, 25},
        {229, 25},
        {230, 25},
        {231, 25},
        {232, 25},
        {233, 25},
        {234, 25},
        {235, 25},
        {236, 25},
        {237, 25},
        {238, 25},
        {239, 25},
        {240, 25},
        {241, 25},
        {242, 25},
        {243, 25},
        {244, 25},
        {245, 25},
        {246, 25},
        {247, 25},
        {248, 25},
        {249, 25},
        {250, 25},
        {251, 25},
        {252, 25},
        {253, 25},
        {254, 25},
        {255, 25},
        {9, 26},
        {10, 36},
        {32, 26},
        {33, 26},
        {34, 26},
        {35, 26},
        {36, 26},
        {37, 26},
        {38, 26},
        {39, 26},
        {40, 26},
        {41, 26},
        {42, 26},
        {43, 26},
        {44, 26},
        {45, 26},
        {46, 26},
        {47, 26},
        {48, 26},
        {49, 26},
        {50, 26},
        {51, 26},
        {52, 26},
        {53, 26},
        {54, 26},
        {55, 26},
        {56, 26},
        {57, 26},
        {58, 26},
        {59, 26},
        {60, 26},
        {61, 26},
        {62, 26},
        {63, 26},
        {64, 26},
        {65, 26},
        {66, 26},
        {67, 26},
        {68, 26},
        {69, 26},
        {70, 26},
        {71, 26},
        {72, 26},
        {73, 26},
        {74, 26},
        {75, 26},
        {76, 26},
        {77, 26},
        {78, 26},
        {79, 26},
        {80, 26},
        {81, 26},
        {82, 26},
        {83, 26},
        {84, 26},
        {85, 26},
        {86, 26},
        {87, 26},
        {88, 26},
        {89, 26},
        {90, 26},
        {91, 26},
        {92, 26},
        {93, 26},
        {94, 26},
        {95, 26},
        {96, 26},
        {97, 26},
        {98, 26},
        {99, 26},
        {100, 26},
        {101, 26},
        {102, 26},
        {103, 26},
        {104, 26},
        {105, 26},
        {106, 26},
        {107, 26},
        {108, 26},
        {109, 26},
        {110, 26},
        {111, 26},
        {112, 26},
        {113, 26},
        {114, 26},
        {115, 26},
        {116, 26},
        {117, 26},
        {118, 26},
        {119, 26},
        {120, 26},
        {121, 26},
        {122, 26},
        {123, 26},
        {124, 26},
        {125, 26},
        {126, 26},
        {161, 26},
        {162, 26},
        {163, 26},
        {164, 26},
        {165, 26},
        {166, 26},
        {167, 26},
        {168, 26},
        {169, 26},
        {170, 26},
        {171, 26},
        {172, 26},
        {173, 26},
        {174, 26},
        {175, 26},
        {176, 26},
        {177, 26},
        {178, 26},
        {179, 26},
        {180, 26},
        {181, 26},
        {182, 26},
        {183, 26},
        {184, 26},
        {185, 26},
        {186, 26},
        {187, 26},
        {188, 26},
        {189, 26},
        {190, 26},
        {191, 26},
        {192, 26},
        {193, 26},
        {194, 26},
        {195, 26},
        {196, 26},
        {197, 26},
        {198, 26},
        {199, 26},
        {200, 26},
        {201, 26},
        {202, 26},
        {203, 26},
        {204, 26},
        {205, 26},
        {206, 26},
        {207, 26},
        {208, 26},
        {209, 26},
        {210, 26},
        {211, 26},
        {212, 26},
        {213, 26},
        {214, 26},
        {215, 26},
        {216, 26},
        {217, 26},
        {218, 26},
        {219, 26},
        {220, 26},
        {221, 26},
        {222, 26},
        {223, 26},
        {224, 26},
        {225, 26},
        {226, 26},
        {227, 26},
        {228, 26},
        {229, 26},
        {230, 26},
        {231, 26},
        {232, 26},
        {233, 26},
        {234, 26},
        {235, 26},
        {236, 26},
        {237, 26},
        {238, 26},
        {239, 26},
        {240, 26},
        {241, 26},
        {242, 26},
        {243, 26},
        {244, 26},
        {245, 26},
        {246, 26},
        {247, 26},
        {248, 26},
        {249, 26},
        {250, 26},
        {251, 26},
        {252, 26},
        {253, 26},
        {254, 26},
        {255, 26},
        {69, 29},
        {101, 29},
        {48, 37},
        {49, 37},
        {50, 37},
        {51, 37},
        {52, 37},
        {53, 37},
        {54, 37},
        {55, 37},
        {56, 37},
        {57, 37},
        {48, 38},
        {49, 38},
        {50, 38},
        {51, 38},
        {52, 38},
        {53, 38},
        {54, 38},
        {55, 38},
        {56, 38},
        {57, 38},
        {48, 18},
        {49, 18},
        {50, 18},
        {51, 18},
        {52, 18},
        {53, 18},
        {54, 18},
        {55, 18},
        {56, 18},
        {57, 18},
        {65, 18},
        {66, 18},
        {67, 18},
        {68, 18},
        {69, 18},
        {70, 18},
        {71, 18},
        {72, 18},
        {73, 18},
        {74, 18},
        {75, 18},
        {76, 18},
        {77, 18},
        {78, 18},
        {79, 18},
        {80, 18},
        {81, 18},
        {82, 18},
        {83, 18},
        {84, 18},
        {85, 18},
        {86, 18},
        {87, 18},
        {88, 18},
        {89, 18},
        {90, 18},
        {97, 18},
        {98, 18},
        {99, 18},
        {100, 18},
        {101, 18},
        {102, 18},
        {103, 18},
        {104, 18},
        {105, 18},
        {106, 18},
        {107, 18},
        {108, 18},
        {109, 18},
        {110, 18},
        {111, 18},
        {112, 18},
        {113, 18},
        {114, 18},
        {115, 18},
        {116, 18},
        {117, 18},
        {118, 18},
        {119, 18},
        {120, 18},
        {121, 18},
        {122, 18},
        {9, 25},
        {10, 25},
        {32, 25},
        {33, 25},
        {34, 25},
        {35, 25},
        {36, 25},
        {37, 25},
        {38, 25},
        {39, 25},
        {40, 25},
        {41, 25},
        {42, 35},
        {43, 25},
        {44, 25},
        {45, 25},
        {46, 25},
        {47, 39},
        {48, 25},
        {49, 25},
        {50, 25},
        {51, 25},
        {52, 25},
        {53, 25},
        {54, 25},
        {55, 25},
        {56, 25},
        {57, 25},
        {58, 25},
        {59, 25},
        {60, 25},
        {61, 25},
        {62, 25},
        {63, 25},
        {64, 25},
        {65, 25},
        {66, 25},
        {67, 25},
        {68, 25},
        {69, 25},
        {70, 25},
        {71, 25},
        {72, 25},
        {73, 25},
        {74, 25},
        {75, 25},
        {76, 25},
        {77, 25},
        {78, 25},
        {79, 25},
        {80, 25},
        {81, 25},
        {82, 25},
        {83, 25},
        {84, 25},
        {85, 25},
        {86, 25},
        {87, 25},
        {88, 25},
        {89, 25},
        {90, 25},
        {91, 25},
        {92, 25},
        {93, 25},
        {94, 25},
        {95, 25},
        {96, 25},
        {97, 25},
        {98, 25},
        {99, 25},
        {100, 25},
        {101, 25},
        {102, 25},
        {103, 25},
        {104, 25},
        {105, 25},
        {106, 25},
        {107, 25},
        {108, 25},
        {109, 25},
        {110, 25},
        {111, 25},
        {112, 25},
        {113, 25},
        {114, 25},
        {115, 25},
        {116, 25},
        {117, 25},
        {118, 25},
        {119, 25},
        {120, 25},
        {121, 25},
        {122, 25},
        {123, 25},
        {124, 25},
        {125, 25},
        {126, 25},
        {161, 25},
        {162, 25},
        {163, 25},
        {164, 25},
        {165, 25},
        {166, 25},
        {167, 25},
        {168, 25},
        {169, 25},
        {170, 25},
        {171, 25},
        {172, 25},
        {173, 25},
        {174, 25},
        {175, 25},
        {176, 25},
        {177, 25},
        {178, 25},
        {179, 25},
        {180, 25},
        {181, 25},
        {182, 25},
        {183, 25},
        {184, 25},
        {185, 25},
        {186, 25},
        {187, 25},
        {188, 25},
        {189, 25},
        {190, 25},
        {191, 25},
        {192, 25},
        {193, 25},
        {194, 25},
        {195, 25},
        {196, 25},
        {197, 25},
        {198, 25},
        {199, 25},
        {200, 25},
        {201, 25},
        {202, 25},
        {203, 25},
        {204, 25},
        {205, 25},
        {206, 25},
        {207, 25},
        {208, 25},
        {209, 25},
        {210, 25},
        {211, 25},
        {212, 25},
        {213, 25},
        {214, 25},
        {215, 25},
        {216, 25},
        {217, 25},
        {218, 25},
        {219, 25},
        {220, 25},
        {221, 25},
        {222, 25},
        {223, 25},
        {224, 25},
        {225, 25},
        {226, 25},
        {227, 25},
        {228, 25},
        {229, 25},
        {230, 25},
        {231, 25},
        {232, 25},
        {233, 25},
        {234, 25},
        {235, 25},
        {236, 25},
        {237, 25},
        {238, 25},
        {239, 25},
        {240, 25},
        {241, 25},
        {242, 25},
        {243, 25},
        {244, 25},
        {245, 25},
        {246, 25},
        {247, 25},
        {248, 25},
        {249, 25},
        {250, 25},
        {251, 25},
        {252, 25},
        {253, 25},
        {254, 25},
        {255, 25},
        {43, 40},
        {45, 40},
        {48, 37},
        {49, 37},
        {50, 37},
        {51, 37},
        {52, 37},
        {53, 37},
        {54, 37},
        {55, 37},
        {56, 37},
        {57, 37},
        {69, 41},
        {101, 41},
        {48, 42},
        {49, 42},
        {50, 42},
        {51, 42},
        {52, 42},
        {53, 42},
        {54, 42},
        {55, 42},
        {56, 42},
        {57, 42},
        {9, 25},
        {10, 25},
        {32, 25},
        {33, 25},
        {34, 25},
        {35, 25},
        {36, 25},
        {37, 25},
        {38, 25},
        {39, 25},
        {40, 25},
        {41, 25},
        {42, 35},
        {43, 25},
        {44, 25},
        {45, 25},
        {46, 25},
        {47, 25},
        {48, 25},
        {49, 25},
        {50, 25},
        {51, 25},
        {52, 25},
        {53, 25},
        {54, 25},
        {55, 25},
        {56, 25},
        {57, 25},
        {58, 25},
        {59, 25},
        {60, 25},
        {61, 25},
        {62, 25},
        {63, 25},
        {64, 25},
        {65, 25},
        {66, 25},
        {67, 25},
        {68, 25},
        {69, 25},
        {70, 25},
        {71, 25},
        {72, 25},
        {73, 25},
        {74, 25},
        {75, 25},
        {76, 25},
        {77, 25},
        {78, 25},
        {79, 25},
        {80, 25},
        {81, 25},
        {82, 25},
        {83, 25},
        {84, 25},
        {85, 25},
        {86, 25},
        {87, 25},
        {88, 25},
        {89, 25},
        {90, 25},
        {91, 25},
        {92, 25},
        {93, 25},
        {94, 25},
        {95, 25},
        {96, 25},
        {97, 25},
        {98, 25},
        {99, 25},
        {100, 25},
        {101, 25},
        {102, 25},
        {103, 25},
        {104, 25},
        {105, 25},
        {106, 25},
        {107, 25},
        {108, 25},
        {109, 25},
        {110, 25},
        {111, 25},
        {112, 25},
        {113, 25},
        {114, 25},
        {115, 25},
        {116, 25},
        {117, 25},
        {118, 25},
        {119, 25},
        {120, 25},
        {121, 25},
        {122, 25},
        {123, 25},
        {124, 25},
        {125, 25},
        {126, 25},
        {161, 25},
        {162, 25},
        {163, 25},
        {164, 25},
        {165, 25},
        {166, 25},
        {167, 25},
        {168, 25},
        {169, 25},
        {170, 25},
        {171, 25},
        {172, 25},
        {173, 25},
        {174, 25},
        {175, 25},
        {176, 25},
        {177, 25},
        {178, 25},
        {179, 25},
        {180, 25},
        {181, 25},
        {182, 25},
        {183, 25},
        {184, 25},
        {185, 25},
        {186, 25},
        {187, 25},
        {188, 25},
        {189, 25},
        {190, 25},
        {191, 25},
        {192, 25},
        {193, 25},
        {194, 25},
        {195, 25},
        {196, 25},
        {197, 25},
        {198, 25},
        {199, 25},
        {200, 25},
        {201, 25},
        {202, 25},
        {203, 25},
        {204, 25},
        {205, 25},
        {206, 25},
        {207, 25},
        {208, 25},
        {209, 25},
        {210, 25},
        {211, 25},
        {212, 25},
        {213, 25},
        {214, 25},
        {215, 25},
        {216, 25},
        {217, 25},
        {218, 25},
        {219, 25},
        {220, 25},
        {221, 25},
        {222, 25},
        {223, 25},
        {224, 25},
        {225, 25},
        {226, 25},
        {227, 25},
        {228, 25},
        {229, 25},
        {230, 25},
        {231, 25},
        {232, 25},
        {233, 25},
        {234, 25},
        {235, 25},
        {236, 25},
        {237, 25},
        {238, 25},
        {239, 25},
        {240, 25},
        {241, 25},
        {242, 25},
        {243, 25},
        {244, 25},
        {245, 25},
        {246, 25},
        {247, 25},
        {248, 25},
        {249, 25},
        {250, 25},
        {251, 25},
        {252, 25},
        {253, 25},
        {254, 25},
        {255, 25},
        {69, 41},
        {101, 41},
        {48, 43},
        {49, 43},
        {50, 43},
        {51, 43},
        {52, 43},
        {53, 43},
        {54, 43},
        {55, 43},
        {56, 43},
        {57, 43},
        {48, 42},
        {49, 42},
        {50, 42},
        {51, 42},
        {52, 42},
        {53, 42},
        {54, 42},
        {55, 42},
        {56, 42},
        {57, 42},
        {48, 44},
        {49, 44},
        {50, 44},
        {51, 44},
        {52, 44},
        {53, 44},
        {54, 44},
        {55, 44},
        {56, 44},
        {57, 44},
        {48, 44},
        {49, 44},
        {50, 44},
        {51, 44},
        {52, 44},
        {53, 44},
        {54, 44},
        {55, 44},
        {56, 44},
        {57, 44}
    };

    int[] TOKEN_STATE = { 0,  0, -1, 40, 41, 46, 44, 35, 45, 36, 47,  3, 48, 34, 38, 39, 37, -1,  2, 42, 43, 54, 55,  5, 50, -1,  0, -1, -1, -1, 49, 52, 51, 53, -1, -1,  0,  4, -1,  0, -1, -1,  3, -1,  4 };

    int[] SPECIAL_CASES_INDEXES =
        { 0, 0, 0, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28 };

    String[] SPECIAL_CASES_KEYS =
        {  "booleano", "cadeia", "caracter", "const", "de", "div", "e", "enquanto", "entao", "escreva", "faca", "falso", "inteiro", "leia", "metodo", "nao", "ou", "programa", "real", "ref", "registro", "retorne", "se", "senao", "val", "var", "verdadeiro", "vetor" };

    int[] SPECIAL_CASES_VALUES =
        {  10, 8, 7, 27, 21, 33, 17, 25, 12, 15, 22, 19, 9, 14, 28, 18, 16, 26, 23, 29, 31, 32, 11, 13, 30, 6, 20, 24 };

    String[] SCANNER_ERROR =
    {
        "Caractere não esperado",
        "",
        "Erro identificando literal",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Erro identificando id",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Erro identificando <ignorar>",
        "",
        "Erro identificando num_int",
        "Erro identificando num_real",
        "Erro identificando num_int",
        "",
        "",
        "",
        "",
        "Erro identificando id",
        "Erro identificando <ignorar>",
        "",
        "",
        "Erro identificando num_int",
        "",
        "Erro identificando num_real",
        "Erro identificando num_real",
        "",
        "Erro identificando num_real",
        ""
    };

}
