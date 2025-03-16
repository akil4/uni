# **PATTERNS**

## Square

    #####           i=0;i<n;i++
    #####               j=0;j<n;j++
    #####                   "#"
    #####               line
    #####

## Triangle

### BottomLeft

    #               i=0;i<n;i++
    ##                  j=0;j<i;j++
    ###                     "#"
    ####                "\n"
    #####           

### TopLeft

    #####           i=0;i<N;i++
    ####                j=0;j<n-i;j++
    ###                     "#"
    ##                  "\n"
    #

### TopRight

    #####           i=0;i<n;i++
     ####               j=0;j<i;j++
      ###                   " "
       ##               j=0;j<n;j++
        #                   "#"
                        "\n"

### BottomRight

        #           i=0;i<n;i++
       ##               j=0;j<n-i-1;j++
      ###                   " "
     ####               j=0;j<=i;j++
    #####                   "#"
                        "\n"

## K

    #####           i=0;i<n;i++
    ####                j=0;j<n-i;j++
    ###                     "#"
    ##                  "\n"
    #               i=1;i<n;i++ 
    ##                  j=0;j<i;j++
    ###                     "#"
    ####                "\n"
    #####